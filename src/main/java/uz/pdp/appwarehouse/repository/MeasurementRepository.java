package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.Measurement;
import uz.pdp.appwarehouse.projection.CustomMeasurement;

@RepositoryRestResource(path = "measurement",excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {

}
