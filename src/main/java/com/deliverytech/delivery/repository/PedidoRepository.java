package com.deliverytech.delivery.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliverytech.delivery.enums.StatusPedido;
import com.deliverytech.delivery.model.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findByClienteId(Long clienteId);
    List<Pedido> findByStatus(StatusPedido status);
    List<Pedido> findByRestauranteId(Long restauranteId);
    List<Pedido> findByDataPedidoBetween(LocalDate inicio, LocalDate fim);
    
}