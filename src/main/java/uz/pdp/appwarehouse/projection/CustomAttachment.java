package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Attachment;
import uz.pdp.appwarehouse.entity.Category;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();
    String getFileOriginalName();
    long getSize();
    String getContentType();
}
