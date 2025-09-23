package com.deliverytech.delivery.repository;

import com.deliverytech.delivery.entity.Produto;
import com.deliverytech.delivery.entity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByRestaurante(Restaurante restaurante);

    List<Produto> findByCategoria(String categoria);

    List<Produto> findByDisponivelTrue();
}
