package uz.pdp.appwarehouse.projection;

import jdk.internal.util.xml.impl.Input;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.*;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Projection(types = Inputs.class)
public interface CustomInput {
    Integer getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    String  getFactureNumber();
    Integer getCode();
}
