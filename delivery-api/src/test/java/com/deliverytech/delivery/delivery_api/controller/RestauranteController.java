package com.deliverytech.delivery.controller;

import com.deliverytech.delivery.model.Restaurante;
import com.deliverytech.delivery.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @GetMapping
    public List<Restaurante> listarTodos() {
        return restauranteRepository.findAll();
    }

    @PostMapping
    public Restaurante criar(@RequestBody Restaurante restaurante) {
        return restauranteRepository.save(restaurante);
    }

    @GetMapping("/{id}")
    public Restaurante buscarPorId(@PathVariable Long id) {
        return restauranteRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        restauranteRepository.deleteById(id);
    }
}
