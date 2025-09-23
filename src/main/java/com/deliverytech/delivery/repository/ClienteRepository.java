package com.deliverytech.delivery.repository;

import com.deliverytech.delivery.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByEmail(String email);

    @Query("SELECT c FROM Cliente c WHERE c.ativo = true")
    List<Cliente> findClientesAtivos();
}
