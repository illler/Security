package com.illler.security.controllers;


import com.illler.security.model.Account;
import com.illler.security.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountRepository accountRepository;
    @GetMapping("/myAccount")
    public Account getAccountDetails(@RequestParam int id){
        Optional<Account> account = accountRepository.findByCustomerId(id);
        return account.orElse(null);
    }

}
