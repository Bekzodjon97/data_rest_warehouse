package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.AttachmentContent;
import uz.pdp.appwarehouse.projection.CustomAttachmentContent;
import uz.pdp.appwarehouse.projection.CustomCategory;

import java.util.Optional;

@RepositoryRestResource(path = "attachmentContent", excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {

}
