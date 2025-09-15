package com.deliverytech.delivery.controller;

import javax.websocket.ClientEndpoint;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClientEndpoint, Long> {
}
