package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.Inputs;
import uz.pdp.appwarehouse.projection.CustomInput;

import java.util.List;
@RepositoryRestResource(path = "input",excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Inputs, Integer> {


}
