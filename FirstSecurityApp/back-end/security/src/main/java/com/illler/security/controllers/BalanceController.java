package com.illler.security.controllers;


import com.illler.security.model.AccountTransaction;
import com.illler.security.repository.AccountTransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class BalanceController {

    private final AccountTransactionRepository accountTransactionRepository;
    @GetMapping("/myBalance")
    public List<AccountTransaction> getBalanceDetails(@RequestParam int id){
        return accountTransactionRepository.findByCustomerIdOrderByTransactionDtDesc(id);
    }

}
