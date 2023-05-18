package com.oyo.supply.recommendation.repo;

import com.oyo.supply.recommendation.entity.SupplyRecommendationData;
import com.oyo.supply.recommendation.pojo.Cluster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplyRecommendationDataRepo extends JpaRepository<SupplyRecommendationData, Integer> {

    @Query(value = "select * from supply_recommendation_data where cluster_name = ?", nativeQuery = true)
    SupplyRecommendationData getByClusterName(@Param("cluster_name") String clusterName);
}
