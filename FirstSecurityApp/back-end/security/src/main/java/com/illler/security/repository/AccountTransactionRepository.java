package com.illler.security.repository;

import com.illler.security.model.AccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, String> {

    List<AccountTransaction> findAllByCustomerIdOrderByTransactionDt(int customer_id);
}
