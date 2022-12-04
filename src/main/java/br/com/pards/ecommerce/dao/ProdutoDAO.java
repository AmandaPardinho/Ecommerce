package br.com.pards.ecommerce.dao;

import br.com.pards.ecommerce.model.Produto;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ProdutoDAO extends CrudRepository<Produto, Integer> {

    public ArrayList<Produto> findByOrderByPreco();
    public ArrayList<Produto> findByOrderByPrecoDesc();
    public ArrayList<Produto> findByNomeContaining(String palavraChave);
}
