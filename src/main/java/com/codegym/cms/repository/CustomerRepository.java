package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

}