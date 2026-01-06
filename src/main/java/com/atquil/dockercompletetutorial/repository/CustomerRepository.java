package com.atquil.dockercompletetutorial.repository;

import com.atquil.dockercompletetutorial.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author atquil
 */
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
    // Custom queries can go here if needed later
}
