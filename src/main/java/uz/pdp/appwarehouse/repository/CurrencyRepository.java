package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.Currency;
import uz.pdp.appwarehouse.projection.CustomCurrency;

@RepositoryRestResource(path = "currency",excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {

}
