package com.deliverytech.delivery.repository;

import com.deliverytech.entity.Pedido;
import com.deliverytech.enums.StatusPedido; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.jpa.repository.Query; 
import org.springframework.data.repository.query.Param; 
import org.springframework.stereotype.Repository; 
import java.time.LocalDateTime;
import java.util.List;


@Repository 
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    // Pedidos por cliente 
    List<Pedido> findByClienteId(Long clienteId); 

    // Pedidos por status 
    List<Pedido> findByStatus(StatusPedido status); 
 
    // 10 pedidos mais recentes 
    List<Pedido> findTop10ByOrderByDataPedidoDesc(); 

    // Pedidos por período 
    List<Pedido> findByDataPedidoBetween(LocalDateTime inicio, LocalDateTime fim); 
    
} 