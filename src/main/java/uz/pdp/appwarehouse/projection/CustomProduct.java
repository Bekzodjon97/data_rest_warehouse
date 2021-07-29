package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Attachment;
import uz.pdp.appwarehouse.entity.Category;
import uz.pdp.appwarehouse.entity.Measurement;
import uz.pdp.appwarehouse.entity.Product;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();
    String getName();
    boolean isActive();
   Category getCategory();
   Attachment getPhoto();
   Integer getCode();
   Measurement getMeasurement();
}
