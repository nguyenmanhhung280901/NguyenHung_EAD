package com.example.nguyenhung_ead.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stocks")
public class StockEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "symbol", nullable = false)
    private String symbol;

    @Column(name = "name", nullable = false)
    private String stockName;

    @Column(name = "price", nullable = false)
    private Double stockPrice;

    public StockEntity() {
    }

    public StockEntity(String symbol, String stockName, Double stockPrice) {
        this.symbol = symbol;
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }
}
