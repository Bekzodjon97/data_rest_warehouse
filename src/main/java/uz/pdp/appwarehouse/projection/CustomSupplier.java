package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Category;
import uz.pdp.appwarehouse.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();
    String getName();
    boolean isActive();
    String getPhoneNumber();
}
