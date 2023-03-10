package jetdevs.service;


import jetdevs.model.DocumentHeaders;
import jetdevs.repository.DocumentHeaderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class DocumentHeaderService extends BaseService {

    private DocumentHeaderRepository documentHeaderRepository;

    @Transactional
    public DocumentHeaders save(final DocumentHeaders documentHeader) {
        return documentHeaderRepository.save(documentHeader);
    }

    @Transactional
    public void saveAll(final List<DocumentHeaders> documentHeaders) {
        documentHeaderRepository.saveAll(documentHeaders);
    }
}
