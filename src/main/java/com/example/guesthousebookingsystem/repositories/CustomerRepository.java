package com.example.guesthousebookingsystem.repositories;

import com.example.guesthousebookingsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    boolean existsByBookingsCustomerId(Long customerId);


}
