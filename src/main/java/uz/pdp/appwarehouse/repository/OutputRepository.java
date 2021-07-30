package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.Outputs;
import uz.pdp.appwarehouse.projection.CustomOutput;


@RepositoryRestResource(path = "output",excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Outputs, Integer> {

}
