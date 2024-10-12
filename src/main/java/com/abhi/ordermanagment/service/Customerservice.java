package com.abhi.ordermanagment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.ordermanagment.entities.Customer;
import com.abhi.ordermanagment.repository.Customerrepository;
import java.util.Optional;
@Service
public class Customerservice {
     
    @Autowired
     private Customerrepository customerrepository;

    public Optional<Customer> getCustomer(long id){
       return customerrepository.findById(id);
    }

    public Customer Addcustomer(Customer customer){
         boolean s=customerrepository.existsByEmail(customer.getEmail());
         if(s==false){
            System.out.println("Email alrady exist");
            return customer;
         }
        return customerrepository.save(customer);
     }
    
}
