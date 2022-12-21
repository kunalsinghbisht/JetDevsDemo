package JetDevsDemo.controller;

import JetDevsDemo.AbstractTest;
import jetdevs.model.UploadDocument;
import jetdevs.repository.FileRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.InputStream;

import static org.junit.Assert.assertEquals;


public class FileUploadControllerTest extends AbstractTest {

    @Override
    @Before
    public void setUp() {
        super.setUp();
    }


    @Test
    @WithMockUser(username = "user", password = "user", roles = "user_role")
    public void testUploadFiles() throws Exception {
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("Country.xlsx");

        assert resourceAsStream != null;
        MockMultipartFile file = new MockMultipartFile("file", "Country.xlsx", "application/vnd.ms-excel", resourceAsStream);
        String uri = "/documents/upload";
        MvcResult mvcResult =  mvc.perform(MockMvcRequestBuilders.multipart(uri)
                        .file(file)
                        .characterEncoding("UTF-8")).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        UploadDocument actual = super.mapFromJson(content, UploadDocument.class);
        assertEquals(actual.getTotalRecords(),4);
    }
}