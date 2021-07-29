package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Category;
import uz.pdp.appwarehouse.entity.InputProduct;
import uz.pdp.appwarehouse.entity.Inputs;
import uz.pdp.appwarehouse.entity.Product;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();
    Product getProduct();
    Double  getAmount();
    Double  getPrice();
    Date getExpireDate();
    Inputs getInputs();
}
