package com.po.ssais.data.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.po.ssais.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
