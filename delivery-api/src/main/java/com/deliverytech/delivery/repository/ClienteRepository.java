package com.deliverytech.delivery.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deliverytech.delivery.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    //Buscar cliente por email
    Optional<Cliente> findByEmail(String email);

    //Buscar apenas clientes ativos
    List<Cliente> findByAtivoTrue();

    //Verifica se email é existe
    boolean existsByEmail(String email);
    
}
