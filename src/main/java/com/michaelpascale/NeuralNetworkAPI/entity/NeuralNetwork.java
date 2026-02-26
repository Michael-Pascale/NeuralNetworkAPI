package com.michaelpascale.NeuralNetworkAPI.entity;

import com.michaelpascale.javaneuralnetworks.utils.FeedForwardNetwork;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@ToString
@Table(name = "neural_networks")
public class NeuralNetwork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    @Getter
    private String name;

    @Getter
    private LocalDateTime createTime;

    private NeuralNetworkStatus status; // PENDING, TRAINING, ACTIVE

    public enum NeuralNetworkStatus {
        PENDING(0),
        TRAINING(1),
        ACTIVE(2);

        private final int value;

        NeuralNetworkStatus(int value) {
            this.value = value;
        }

        public static NeuralNetworkStatus fromValue(int value) {
            for (NeuralNetworkStatus status : values()) {
                if (status.getValue() == value) {
                    return status;
                }
            }
            throw new IllegalArgumentException("Invalid status: " + value);
        }

        public int getValue() {
            return value;
        }
    }


    public NeuralNetwork(String name) {
        this.name = name;
        this.createTime = LocalDateTime.now();
        this.status = NeuralNetworkStatus.PENDING;
    }
}
