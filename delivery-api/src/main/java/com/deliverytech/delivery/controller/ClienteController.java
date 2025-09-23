package com.deliverytech.delivery.controller;

import com.deliverytech.delivery.model.Cliente;
import com.deliverytech.delivery.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente clienteAtualizado) {
        return clienteRepository.findById(id)
                .map(cliente -> {
                    cliente.setNome(clienteAtualizado.getNome());
                    cliente.setEmail(clienteAtualizado.getEmail());
                    cliente.setTelefone(clienteAtualizado.getTelefone());
                    return clienteRepository.save(cliente);
                })
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }
}
