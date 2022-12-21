package jetdevs.repository;


import jetdevs.model.UploadDocument;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends PagingAndSortingRepository<UploadDocument, Long> {

}
