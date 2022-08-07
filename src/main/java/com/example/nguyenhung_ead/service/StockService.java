package com.example.nguyenhung_ead.service;

import com.example.nguyenhung_ead.entity.StockEntity;
import com.example.nguyenhung_ead.repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService{
    @Autowired
    StockRepo stockRepo;

    public List<StockEntity> getAllStock(){
        return stockRepo.findAll();
    }

    public List<StockEntity> findNameBySymbol(String symbol){
        return stockRepo.findByName(symbol);
    }

}
