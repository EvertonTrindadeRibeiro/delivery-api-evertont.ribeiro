package com.deliverytech.delivery.repository;

import com.deliverytech.delivery.entity.Pedido;
import com.deliverytech.delivery.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findByCliente(Cliente cliente);

    List<Pedido> findByStatus(String status);

    List<Pedido> findByDataCriacaoBetween(LocalDateTime inicio, LocalDateTime fim);
}
