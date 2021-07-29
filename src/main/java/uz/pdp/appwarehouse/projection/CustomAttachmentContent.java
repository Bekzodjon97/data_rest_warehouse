package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Attachment;
import uz.pdp.appwarehouse.entity.AttachmentContent;
import uz.pdp.appwarehouse.entity.Category;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    Integer getId();
    byte[] getBytes();
    Attachment getAttachment();
}
