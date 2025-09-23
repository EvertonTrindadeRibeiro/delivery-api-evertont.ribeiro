package com.deliverytech.delivery.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliverytech.delivery.entity.Restaurante;
import com.deliverytech.delivery.service.RestauranteService;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

    private final RestauranteService restauranteService;

    public RestauranteController(RestauranteService restauranteService) {
        this.restauranteService = restauranteService;
    }

    @GetMapping
    public List<Restaurante> listarTodos() {
        return restauranteService.listarTodos();
    }

    @GetMapping("/{id}")
    public Restaurante buscarPorId(@PathVariable Long id) {
        return restauranteService.buscarPorId(id);
    }

    @PostMapping
    public Restaurante salvar(@RequestBody Restaurante restaurante) {
        return restauranteService.salvar(restaurante);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        restauranteService.excluir(id);
    }

    @GetMapping("/categoria/{categoria}")
    public List<Restaurante> listarPorCategoria(@PathVariable String categoria) {
        return restauranteService.listarPorCategoria(categoria);
    }

    @GetMapping("/ativos")
    public List<Restaurante> listarAtivos() {
        return restauranteService.listarAtivos();
    }
}
