package com.example.Fruit_Month_Price;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitMonthPriceRepository extends JpaRepository<FruitMonthPrice, Long> {
    // Custom query methods can be added here if needed
    FruitMonthPrice findByFruitAndMonth(String fruit, String month);
}
