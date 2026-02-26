package com.michaelpascale.NeuralNetworkAPI.controller;

import com.michaelpascale.NeuralNetworkAPI.NeuralNetworkInfo;
import com.michaelpascale.NeuralNetworkAPI.entity.NeuralNetwork;
import com.michaelpascale.NeuralNetworkAPI.service.INeuralNetworkService;
import jakarta.servlet.ServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class NeuralNetworkController {

    @Autowired
    private INeuralNetworkService service;


    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }

    @PostMapping("models/create")
    public String createModel(@RequestBody CreateModelRequest createModelRequest) {
        return service.createModel(createModelRequest);
    }

    @GetMapping("models")
    public List<NeuralNetworkInfo> viewModels(ServletRequest servletRequest) {
        return service.viewModels();
    }

    @GetMapping("models/{id}")
    public NeuralNetwork viewModel(@PathVariable Long id) {
        return service.viewModel(id);
    }

    @DeleteMapping("models/{id}")
    public void deleteModel(@PathVariable Long id) {
        // TODO Response to know if delete was successful. theres no error if you try deleting something that
        // doesnt exist
        service.deleteModel(id);
    }

}