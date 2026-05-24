package com.example.guesthousebookingsystem.services;


import com.example.guesthousebookingsystem.dtos.CustomerDTO;
import com.example.guesthousebookingsystem.models.Customer;
import com.example.guesthousebookingsystem.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service


public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.findAll()
                .stream()
                .map(c -> new CustomerDTO(c.getName(), c.getId()))
                .toList();
    }

    @Override
    public CustomerDTO getById(Long id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow();
        return new CustomerDTO(customer.getName(), customer.getId());
    }

    @Override
    public void save(CustomerDTO customerDTO) {
        Customer customer = new Customer(customerDTO.getName());
        customerRepository.save(customer);

    }
    @Override
    public void delete(Long id) {
        if (customerRepository.existsByBookingsCustomerId(id)) {
            throw new RuntimeException("Kan inte ta bort kund med aktiva bokningar!");
        }
        customerRepository.deleteById(id);
    }


}

