package com.omri.backend.repository;

import com.omri.backend.entity.StockHolding;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockHoldingRepository extends JpaRepository<StockHolding, Long> {

}