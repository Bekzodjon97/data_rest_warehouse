package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.Client;
import uz.pdp.appwarehouse.projection.CustomClient;

@RepositoryRestResource(path = "client",excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
