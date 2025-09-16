package com.deliverytech.delivery.repository

import com.deliverytech.delivery.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository; 
import java.math.BigDecimal; 
import java.util.List;

@Repository 
public interface ProdutoRepository extends JpaRepository<Produto, Long> { 
    // Produtos por restaurante 
    List<Produto> findByRestauranteId(Long restauranteId); 

    // Apenas produtos disponíveis 
    List<Produto> findByDisponivelTrue(); 

    // Produtos por categoria 
    List<Produto> findByCategoria(String categoria); 
    
    // Por faixa de preço (menor ou igual) 
    List<Produto> findByPrecoLessThanEqual(BigDecimal preco); 
} 