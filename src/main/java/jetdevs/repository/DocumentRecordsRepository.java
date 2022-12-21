package jetdevs.repository;



import jetdevs.model.DocumentRecords;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRecordsRepository extends PagingAndSortingRepository<DocumentRecords, Long> {

    List<DocumentRecords> findByFileId(long id);

}


