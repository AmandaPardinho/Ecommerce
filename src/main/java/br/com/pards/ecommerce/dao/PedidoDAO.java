package br.com.pards.ecommerce.dao;

import br.com.pards.ecommerce.model.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoDAO extends CrudRepository<Pedido, Integer> {

}
