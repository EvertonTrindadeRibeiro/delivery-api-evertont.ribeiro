package com.deliverytech.delivery.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deliverytech.delivery.entity.Pedido;
import com.deliverytech.delivery.entity.ItemPedido;
import com.deliverytech.delivery.entity.Produto;
import com.deliverytech.delivery.repository.PedidoRepository;
import com.deliverytech.delivery.repository.ProdutoRepository;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ProdutoRepository produtoRepository;

    public PedidoService(PedidoRepository pedidoRepository, ProdutoRepository produtoRepository) {
        this.pedidoRepository = pedidoRepository;
        this.produtoRepository = produtoRepository;
    }

    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    public Pedido buscarPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public Pedido salvar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public void excluir(Long id) {
        pedidoRepository.deleteById(id);
    }

    public List<Pedido> listarPorCliente(Long clienteId) {
        return pedidoRepository.findByClienteId(clienteId);
    }

    public List<Pedido> listarPorRestaurante(Long restauranteId) {
        return pedidoRepository.findByRestauranteId(restauranteId);
    }

    @Transactional
    public Pedido salvarPedidoComItens(Pedido pedido) {
        pedidoRepository.save(pedido);

        for (ItemPedido item : pedido.getItens()) {
            Produto produto = item.getProduto();
            produto.setEstoque(produto.getEstoque() - item.getQuantidade());
            produtoRepository.save(produto);
        }

        return pedido;
    }
}
