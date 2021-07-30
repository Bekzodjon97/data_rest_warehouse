package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.Warehouse;
import uz.pdp.appwarehouse.projection.CustomWarehouse;

@RepositoryRestResource(path = "warehouse",excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {

}
