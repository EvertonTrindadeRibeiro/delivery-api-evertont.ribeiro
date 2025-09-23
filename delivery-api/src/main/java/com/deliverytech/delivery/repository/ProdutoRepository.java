package com.deliverytech.delivery.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliverytech.delivery.model.Produto;
 
public interface ProdutoRepository extends JpaRepository<Produto, Long> { 

    List<Produto> findByNomeContainingIgnoreCase(String nome);

    List<Produto> findByPrecoBetween(BigDecimal min, BigDecimal max);
    // Produtos por restaurante 
    List<Produto> findByRestauranteId(Long restauranteId); 

    // Apenas produtos disponíveis 
    List<Produto> findByDisponivelTrue(); 

    // Produtos por categoria 
    List<Produto> findByCategoria(String categoria); 
    
    // Por faixa de preço (menor ou igual) 
    List<Produto> findByPrecoLessThanEqual(BigDecimal preco); 
} 