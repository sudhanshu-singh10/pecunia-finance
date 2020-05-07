package com.cg.pf.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.pf.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
