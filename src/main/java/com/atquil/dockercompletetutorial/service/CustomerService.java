package com.atquil.dockercompletetutorial.service;

import com.atquil.dockercompletetutorial.dto.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @author atquil
*/
@Service
@RequiredArgsConstructor
public class CustomerService {

    public Iterable<Customer> getAllCustomers(){ return List.of(new Customer(1,"Atquil")); }
    
}
