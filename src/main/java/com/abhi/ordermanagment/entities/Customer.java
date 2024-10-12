package com.abhi.ordermanagment.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customertable")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
  
    @Column(name = "name") // Column name in the table
    private String name;

    @Column(name = "email") // Column name in the table
    private String email;

    @Column(name = "address") // Column name in the table
    private String address;

    @Column(name = "mobile_number") // Column name in the table
    private String mobileNumber;
}
