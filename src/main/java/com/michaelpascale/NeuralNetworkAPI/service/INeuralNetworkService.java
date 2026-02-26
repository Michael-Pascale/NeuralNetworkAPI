package com.michaelpascale.NeuralNetworkAPI.service;

import com.michaelpascale.NeuralNetworkAPI.controller.CreateModelRequest;
import com.michaelpascale.NeuralNetworkAPI.entity.NeuralNetwork;
import com.michaelpascale.NeuralNetworkAPI.NeuralNetworkInfo;

import java.util.List;

public interface INeuralNetworkService {
    String createModel(CreateModelRequest createModelRequest);
    List<NeuralNetworkInfo> viewModels();
    NeuralNetwork viewModel(Long id);
    void deleteModel(Long id);
}
