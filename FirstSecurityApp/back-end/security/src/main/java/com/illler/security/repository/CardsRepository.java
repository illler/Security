package com.illler.security.repository;

import com.illler.security.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CardsRepository extends JpaRepository<Card, Integer> {
    List<Card> findByCustomerId(int customerId);
}
