package com.example.customer.service;

import com.example.customer.models.Customer;
import com.example.customer.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Slf4j
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<Customer> getListCustomer(){
        return  customerRepository.findAll();
    }
    public  Customer getCustomerById(long id){
        return customerRepository.findById(id).get();
    }
}
