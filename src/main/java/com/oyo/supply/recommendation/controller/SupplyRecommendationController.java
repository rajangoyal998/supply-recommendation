package com.oyo.supply.recommendation.controller;

import com.oyo.supply.recommendation.entity.SupplyRecommendationData;
import com.oyo.supply.recommendation.repo.SupplyRecommendationDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupplyRecommendationController {

    @Autowired
    private SupplyRecommendationDataRepo supplyRecommendationDataRepo;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public SupplyRecommendationData getSupplyRecommendation(@RequestParam String clusterName){
        return supplyRecommendationDataRepo.getByClusterName(clusterName);
    }
}
