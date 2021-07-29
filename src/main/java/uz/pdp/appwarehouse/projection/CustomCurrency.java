package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Category;
import uz.pdp.appwarehouse.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();
    String getName();
    boolean isActive();
}
