package com.michaelpascale.NeuralNetworkAPI.controller;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CreateModelRequest {
    private String name;
    private double learningRate;
    private int inputLen,hiddenLen,outputLen;
}
