package com.illler.security.controllers;


import com.illler.security.model.Loan;
import com.illler.security.repository.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class LoansController {

    private final LoanRepository loanRepository;
    @GetMapping("/myLoans")
    public List<Loan> getLoansDetails(@RequestParam int id){
        return loanRepository.findByCustomerIdOrderByStartDtDesc(id);
    }

}
