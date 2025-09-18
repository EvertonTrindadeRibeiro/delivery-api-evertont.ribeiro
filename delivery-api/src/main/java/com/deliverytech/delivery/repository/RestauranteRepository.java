package com.deliverytech.delivery.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deliverytech.delivery.model.Restaurante;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

    // Busca por categoria (campo singular)
    List<Restaurante> findByCategoriaId(Long id);

    // Busca por restaurante ativo
    List<Restaurante> findByAtivoTrue();

    // Por taxa de entrega menor ou igual
    List<Restaurante> findByTaxaEntregaLessThanEqual(BigDecimal valor);

    // Top 5 restaurantes por nome (ordem alfabética)
    List<Restaurante> findTop5ByOrderByNomeAsc();
}
