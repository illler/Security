package com.illler.security.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "authorities")
public class Authorities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Authorities() {
    }
}
