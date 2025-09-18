package com.deliverytech.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.deliverytech.delivery.model.Restaurante;
import com.deliverytech.delivery.repository.RestauranteRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @GetMapping
    public List<Restaurante> listar() {
        return restauranteRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Restaurante> criar(@Valid @RequestBody Restaurante restaurante) {
        Restaurante salvo = restauranteRepository.save(restaurante);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurante> buscarPorId(@PathVariable Long id) {
        return restauranteRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Restaurante> atualizar(@PathVariable Long id, @Valid @RequestBody Restaurante dados) {
        return restauranteRepository.findById(id)
                .map(restaurante -> {
                    restaurante.setNome(dados.getNome());
                    restaurante.setCategoria(dados.getCategoria());
                    restaurante.setTelefone(dados.getTelefone());
                    restaurante.setTaxaEntrega(dados.getTaxaEntrega());
                    restaurante.setAtivo(dados.getAtivo());
                    return ResponseEntity.ok(restauranteRepository.save(restaurante));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (restauranteRepository.existsById(id)) {
            restauranteRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
