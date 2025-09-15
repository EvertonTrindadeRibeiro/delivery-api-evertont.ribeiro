package com.deliverytech.delivery.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliverytech.delivery.entity.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

}