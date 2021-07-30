package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.User;
import uz.pdp.appwarehouse.projection.CustomUser;

import java.util.List;

@RepositoryRestResource(path = "user",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {


}
