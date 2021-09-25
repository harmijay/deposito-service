package com.example.deposito.repo;

import com.example.deposito.model.JenisDeposito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JenisDepositoRepo extends JpaRepository<JenisDeposito, Integer> {
}
