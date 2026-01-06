package com.atquil.dockercompletetutorial.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author atquil
 */
@Entity
@Table(name = "CUSTOMER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Uses Postgres 'SERIAL'
    private Integer id;

    @Column(name = "full_name", nullable = false) // Maps to 'full_name' column
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;
}
