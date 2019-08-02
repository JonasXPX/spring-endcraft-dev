package dev.endcraft.rest.devrest.repository;

import org.hibernate.query.spi.QueryProducerImplementor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.endcraft.rest.devrest.entitys.Customer;


@Repository
public interface CustumerRepository extends CrudRepository<Customer, Long>, QuerydslPredicateExecutor<Customer>{}