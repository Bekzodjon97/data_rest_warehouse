package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.InputProduct;
import uz.pdp.appwarehouse.projection.CustomAttachment;
import uz.pdp.appwarehouse.projection.CustomInputProduct;

@RepositoryRestResource(path = "inputProduct",excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {

}
