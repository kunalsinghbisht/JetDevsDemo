package jetdevs.repository;


import jetdevs.model.DocumentHeaders;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentHeaderRepository extends PagingAndSortingRepository<DocumentHeaders, Long> {

    List<DocumentHeaders> findByFileId(long id);
}
