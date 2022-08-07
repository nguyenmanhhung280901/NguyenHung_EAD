package com.example.nguyenhung_ead.repository;

import com.example.nguyenhung_ead.entity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StockRepo extends JpaRepository<StockEntity, Integer> {

    @Query("select s from StockEntity s where s.symbol = :symbol")
    List<StockEntity> findByName(String symbol);
}
