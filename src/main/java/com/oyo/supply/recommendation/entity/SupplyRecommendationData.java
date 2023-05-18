package com.oyo.supply.recommendation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "supply_recommendation_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplyRecommendationData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cluster_name")
    private String clusterName;

}
