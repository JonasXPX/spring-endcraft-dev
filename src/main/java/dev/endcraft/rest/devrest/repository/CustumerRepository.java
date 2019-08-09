package dev.endcraft.rest.devrest.repository;

import dev.endcraft.rest.devrest.entitys.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustumerRepository extends CrudRepository<Customer, Long>{

    Customer findByCustumerName(String name);


}