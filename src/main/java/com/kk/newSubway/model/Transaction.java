package com.kk.newSubway.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) // Foreign key reference
    @JsonIgnore
    private User user;

    private Double amount;
    private String type; // "ADD" or "DEDUCT"
    private LocalDateTime timestamp;

}