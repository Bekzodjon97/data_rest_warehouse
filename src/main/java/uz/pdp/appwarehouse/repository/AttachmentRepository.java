package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.Attachment;
import uz.pdp.appwarehouse.projection.CustomAttachment;

@RepositoryRestResource(path = "attachment",excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {

}
