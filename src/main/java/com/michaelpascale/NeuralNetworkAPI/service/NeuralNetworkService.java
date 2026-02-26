package com.michaelpascale.NeuralNetworkAPI.service;

import com.michaelpascale.NeuralNetworkAPI.controller.CreateModelRequest;
import com.michaelpascale.NeuralNetworkAPI.entity.NeuralNetwork;
import com.michaelpascale.NeuralNetworkAPI.NeuralNetworkInfo;
import com.michaelpascale.NeuralNetworkAPI.repository.NeuralNetworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeuralNetworkService implements INeuralNetworkService{

    @Autowired
    private NeuralNetworkRepository repository;

    /**
     * Creates a new, untrained model
     */
    public String createModel(CreateModelRequest createModelRequest) {
        NeuralNetwork network = new NeuralNetwork(createModelRequest.getName());
        repository.save(network);
        // entityManager.persist(network);
        return "Creating model: %s".formatted(network.toString());
    }

    // TODO change findAll to a query that just gets name and date. the networks may be gb in size.

    /**
     * View information of all models on the system.
     */
    public List<NeuralNetworkInfo> viewModels() {
        return repository.findAll().stream()
                .map(neuralNetwork -> new NeuralNetworkInfo(neuralNetwork.getName(), neuralNetwork.getCreateTime()))
                .toList();
    }

    /**
     * View details of a specific model.
     * @param id
     */
    public NeuralNetwork viewModel(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void deleteModel(Long id) {
        repository.deleteById(id);
    }
}
