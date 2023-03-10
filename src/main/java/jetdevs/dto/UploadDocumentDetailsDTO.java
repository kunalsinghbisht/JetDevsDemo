package jetdevs.dto;


import jetdevs.model.DocumentHeaders;
import jetdevs.model.DocumentRecords;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class UploadDocumentDetailsDTO {
    private String name;
    private int totalRecords;
    private int totalHeaders;
    private int totalUploaded;
    private String status = null;
    private int uploadBy;
    private int lastReviewedBy;
    private Boolean deleted = Boolean.FALSE;
    private LocalDateTime lastReviewedTime;
    private List<DocumentHeaders> documentHeadersList;
    private List<DocumentRecords> documentRecordsList;
}
