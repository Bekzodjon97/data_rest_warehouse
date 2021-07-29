package uz.pdp.appwarehouse.projection;

import org.hibernate.result.Output;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.*;

import java.sql.Timestamp;

@Projection(types = Outputs.class)
public interface CustomOutput {
    Integer getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Client getClient();
    Currency getCurrency();
    String  getFactureNumber();
    Integer getCode();
}

