package com.deliverytech.delivery.model;

import java.time.LocalDate;

import com.deliverytech.delivery.enums.StatusPedido;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long clienteId;
    private Long restauranteId;
    private LocalDate dataPedido;

    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    public Pedido() {}

    // Getters e setters...
}
