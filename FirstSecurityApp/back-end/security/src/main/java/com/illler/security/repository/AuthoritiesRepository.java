package com.illler.security.repository;

import com.illler.security.model.Authorities;
import com.illler.security.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface AuthoritiesRepository extends JpaRepository<Authorities, Long> {

    Set<Authorities> findAllByCustomer(Customer c);
}
