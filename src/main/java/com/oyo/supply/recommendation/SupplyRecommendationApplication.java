package com.oyo.supply.recommendation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.oyo.supply.recommendation"})
@SpringBootApplication
public class SupplyRecommendationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupplyRecommendationApplication.class, args);
    }

}
