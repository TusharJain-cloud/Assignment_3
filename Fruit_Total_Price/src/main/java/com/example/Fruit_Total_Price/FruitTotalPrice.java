package com.example.Fruit_Total_Price;

import java.math.BigDecimal;

public class FruitTotalPrice {

    private Long id;
    private String fruit;
    private String month;
    private BigDecimal fmp;
    private BigDecimal quantity;
    private BigDecimal totalPrice;
    private String environment;

    // Constructors
    public FruitTotalPrice() {
    }

    public FruitTotalPrice(Long id, String fruit, String month, BigDecimal fmp, BigDecimal quantity, BigDecimal totalPrice, String environment) {
        this.id = id;
        this.fruit = fruit;
        this.month = month;
        this.fmp = fmp;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.environment = environment;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public BigDecimal getFmp() {
        return fmp;
    }

    public void setFmp(BigDecimal fmp) {
        this.fmp = fmp;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}