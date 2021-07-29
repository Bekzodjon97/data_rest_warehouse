package uz.pdp.appwarehouse.projection;

import org.hibernate.result.Output;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.*;

import java.util.Date;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();
    Product getProduct();
    Double  getAmount();
    Double  getPrice();
    Outputs getOutputs();
}
