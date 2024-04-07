package com.example.customer.controller;

import com.example.customer.models.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    List<Customer> getListCustomer(){
        return customerService.getListCustomer();
    }
    @GetMapping("/customers/{id}")
    Customer getCustomerById(@PathVariable long id){
        return customerService.getCustomerById(id);
    }
}
