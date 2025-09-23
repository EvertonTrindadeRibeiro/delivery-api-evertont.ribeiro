package com.deliverytech.delivery.repository;

import com.deliverytech.delivery.entity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

    List<Restaurante> findByNomeContainingIgnoreCase(String nome);

    List<Restaurante> findByCategoria(String categoria);

    List<Restaurante> findByAtivoTrueOrderByAvaliacaoDesc();
}
