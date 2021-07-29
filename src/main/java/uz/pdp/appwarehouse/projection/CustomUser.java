package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Category;
import uz.pdp.appwarehouse.entity.User;
import uz.pdp.appwarehouse.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.List;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();
    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    Integer getCode();
    String getPassword();
    List<Warehouse> getWarehouses();
    boolean isActive();
}
