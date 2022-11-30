package br.com.pards.ecommerce.service;

import br.com.pards.ecommerce.dao.PedidoDAO;
import br.com.pards.ecommerce.model.ItemPedido;
import br.com.pards.ecommerce.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements IPedidoService{

    @Autowired
    private PedidoDAO dao;

    @Override
    public Pedido inserirNovoPedido(Pedido novo) {
        //antes de fazer um SAVE. é preciso indicar aos "filhos" (itens) a qual pedido eles pertencem
        for(ItemPedido item: novo.getItens()){
            item.setPedido(novo);
        }
        return dao.save(novo);
    }

    @Override
    public Pedido recuperarPeloNumero(Integer numero) {
        return dao.findById(numero).orElse(null);
    }
}
