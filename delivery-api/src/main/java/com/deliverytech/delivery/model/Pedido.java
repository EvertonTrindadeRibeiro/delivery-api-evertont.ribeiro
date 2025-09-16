package com.deliverytech.delivery.model;

import jakarta.persistence.*;
import java.time.LocalDate;

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
