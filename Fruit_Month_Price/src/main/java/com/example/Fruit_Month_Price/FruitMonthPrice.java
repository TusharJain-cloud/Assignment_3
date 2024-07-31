package com.example.Fruit_Month_Price;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

import java.math.BigDecimal;



import java.math.BigDecimal;

@Entity
public class FruitMonthPrice {


    @Id
    private Long id;

    @Column(name = "fruit_name")
    private String fruit;

    @Column(name = "month_name")
    private String month;

    @Column(name = "fmp")
    private BigDecimal fmp;
    private String environment;
    public FruitMonthPrice() {
    }

    public FruitMonthPrice(Long id, String fruit, String month, BigDecimal fmp) {
        this.id = id;
        this.fruit = fruit;
        this.month = month;
        this.fmp = fmp;
    }

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

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}