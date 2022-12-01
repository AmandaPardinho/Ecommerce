package br.com.pards.ecommerce.service;

import br.com.pards.ecommerce.dto.FaturamentoMensal;
import br.com.pards.ecommerce.model.Pedido;

import java.util.ArrayList;

public interface IPedidoService {

    public Pedido inserirNovoPedido(Pedido novo);
    public Pedido recuperarPeloNumero(Integer numero);
    public ArrayList<FaturamentoMensal> recuperarFaturamento(Integer ano);
}
