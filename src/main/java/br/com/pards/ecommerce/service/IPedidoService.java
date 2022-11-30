package br.com.pards.ecommerce.service;

import br.com.pards.ecommerce.model.Pedido;

public interface IPedidoService {

    public Pedido inserirNovoPedido(Pedido novo);
    public Pedido recuperarPeloNumero(Integer numero);
}
