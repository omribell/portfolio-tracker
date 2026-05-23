package com.omri.backend.controller;

import com.omri.backend.entity.StockHolding;
import com.omri.backend.repository.StockHoldingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/holdings")
public class StockHoldingController {

    private final StockHoldingRepository stockHoldingRepository;

    public StockHoldingController(StockHoldingRepository stockHoldingRepository) {
        this.stockHoldingRepository = stockHoldingRepository;
    }

    @GetMapping
    public List<StockHolding> getAllHoldings() {
        return stockHoldingRepository.findAll();
    }

    @PostMapping
    public StockHolding createHolding(@RequestBody StockHolding stockHolding) {
        return stockHoldingRepository.save(stockHolding);
    }
}