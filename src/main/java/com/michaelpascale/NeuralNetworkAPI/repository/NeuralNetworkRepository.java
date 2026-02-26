package com.michaelpascale.NeuralNetworkAPI.repository;

import com.michaelpascale.NeuralNetworkAPI.NeuralNetworkInfo;
import com.michaelpascale.NeuralNetworkAPI.entity.NeuralNetwork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NeuralNetworkRepository extends JpaRepository<NeuralNetwork, Long> {

    @Query("SELECT new com.michaelpascale.NeuralNetworkAPI.NeuralNetworkInfo(n.name, n.createTime) FROM NeuralNetwork n")
    List<NeuralNetworkInfo> findAllInfo();
}
