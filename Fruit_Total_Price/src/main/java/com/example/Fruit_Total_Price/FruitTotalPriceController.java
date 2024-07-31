package com.example.Fruit_Total_Price;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FruitTotalPriceController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/fruit-total-price/fruit/{fruit}/month/{month}/quantity/{quantity}")
    public FruitTotalPrice calculateFruitTotalPrice(
            @PathVariable String fruit,
            @PathVariable String month,
            @PathVariable BigDecimal quantity) {

        // Prepare URL and URI variables
        HashMap<String,String> uriVariables = new HashMap<>();
        uriVariables.put("fruit",fruit);
        uriVariables.put("month",month);

        ResponseEntity<FruitTotalPrice> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/fruit-month-price/fruit/{fruit}/month/{month}",FruitTotalPrice.class, uriVariables);

        FruitTotalPrice fruitTotalPrice = responseEntity.getBody();



        // Construct the final CurrencyConversion object
        return new FruitTotalPrice(
                fruitTotalPrice.getId(),
                fruit,
                month,
                quantity,
                fruitTotalPrice.getFmp(),
                quantity.multiply(fruitTotalPrice.getFmp()),
                fruitTotalPrice.getEnvironment()+" "+ "rest template"
        );
    }
}