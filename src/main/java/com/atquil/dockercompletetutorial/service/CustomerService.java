package com.atquil.dockercompletetutorial.service;

import com.atquil.dockercompletetutorial.dto.Customer;
import com.atquil.dockercompletetutorial.entity.CustomerEntity;
import com.atquil.dockercompletetutorial.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 *  @author atquil
*/
@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll() // Fetches Entities from DB
                .stream()
                .map(this::mapToDto)        // Converts Entity -> DTO
                .collect(Collectors.toList());
    }

    private Customer mapToDto(CustomerEntity entity) {
        return new Customer(
                entity.getId(),
                entity.getFullName(),
                entity.getEmail()
        );
    }
    
}
