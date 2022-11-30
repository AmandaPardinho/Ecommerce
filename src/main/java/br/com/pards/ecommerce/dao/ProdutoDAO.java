package br.com.pards.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

public interface ProdutoDAO extends CrudRepository<Produto, Integer> {
}
