package com.illler.security.controllers;

import com.illler.security.model.Customer;
import com.illler.security.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final CustomerRepository customerRepository;

    private final PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Customer customer){
        try {
            customer.setPwd(passwordEncoder.encode(customer.getPwd()));
            customerRepository.save(customer);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body("Given user details are successfully registered");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error: " + e.getMessage());
        }
    }

    @GetMapping("/user")
    public Customer getUserDetailsAfterLogin(Authentication authentication){
        Optional<Customer> customer = customerRepository.findByEmail(authentication.getName());
        return customer.orElse(null);
    }

}
