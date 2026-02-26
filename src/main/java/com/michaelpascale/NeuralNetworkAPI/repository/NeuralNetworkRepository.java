package com.michaelpascale.NeuralNetworkAPI.repository;

import com.michaelpascale.NeuralNetworkAPI.entity.NeuralNetwork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeuralNetworkRepository extends JpaRepository<NeuralNetwork, Long> {
}
