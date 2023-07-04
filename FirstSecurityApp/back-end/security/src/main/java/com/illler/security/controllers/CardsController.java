package com.illler.security.controllers;


import com.illler.security.model.Card;
import com.illler.security.repository.CardsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CardsController {

    private final CardsRepository cardsRepository;
    @GetMapping("/myCards")
    public List<Card> getCardsDetails(@RequestParam int id){
        return cardsRepository.findByCustomerId(id);

    }

}
