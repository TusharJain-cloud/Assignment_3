package com.example.Fruit_Month_Price;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class FruitMonthPriceController {


    @Autowired
    private FruitMonthPriceRepository repository;

    @Autowired
    private Environment environment;

    @GetMapping("/fruit-month-price/fruit/{fruit}/month/{month}")
    public FruitMonthPrice retrieveValue(
            @PathVariable String fruit,
            @PathVariable String month
    ) {
        // Fetch data from the repository
        FruitMonthPrice fruitMonthPrice = repository.findByFruitAndMonth(fruit, month);

        if(fruitMonthPrice == null){
            throw new RuntimeException("Unable to find data for " +fruit+ " and " +month);
        }

        String port = environment.getProperty("local.server.port");
        fruitMonthPrice.setEnvironment(port);

        return fruitMonthPrice;
    }
}
