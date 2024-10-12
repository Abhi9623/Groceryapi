package com.abhi.ordermanagment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.ordermanagment.entities.Customer;
import com.abhi.ordermanagment.service.Customerservice;
@Controller
@RestController
@RequestMapping("/blinkit/customers")
public class Customercontroller {
    @Autowired
    private Customerservice customerservice;
    
    
    @GetMapping("/{id}")
public ResponseEntity<Customer> getCustomer(@PathVariable Long id) {
    Optional<Customer> customerOpt = customerservice.getCustomer(id);
    
    return customerOpt.map(ResponseEntity::ok) // If found, return 200 with customer
                      .orElseGet(() -> ResponseEntity.notFound().build()); // Return 404 if not found
}

    @PostMapping("/json-request")
    public @ResponseBody ResponseEntity<Customer>PostBody(@RequestBody Customer customer){
           Customer customer2=customerservice.Addcustomer(customer);
          return ResponseEntity.ok(customer2);
    }
}
