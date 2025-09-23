package com.deliverytech.delivery;

import com.deliverytech.delivery.controller.*;
import com.deliverytech.delivery.service.*;
import com.deliverytech.delivery.repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DeliveryApiApplicationTests {

    @Autowired
    private ClienteController clienteController;

    @Autowired
    private RestauranteController restauranteController;

    @Autowired
    private ProdutoController produtoController;

    @Autowired
    private PedidoController pedidoController;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private RestauranteService restauranteService;

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Test
    void contextLoads() {
        // Verifica se todos os componentes foram injetados corretamente
        assertThat(clienteController).isNotNull();
        assertThat(restauranteController).isNotNull();
        assertThat(produtoController).isNotNull();
        assertThat(pedidoController).isNotNull();

        assertThat(clienteService).isNotNull();
        assertThat(restauranteService).isNotNull();
        assertThat(produtoService).isNotNull();
        assertThat(pedidoService).isNotNull();

        assertThat(clienteRepository).isNotNull();
        assertThat(restauranteRepository).isNotNull();
        assertThat(produtoRepository).isNotNull();
        assertThat(pedidoRepository).isNotNull();
    }
}
