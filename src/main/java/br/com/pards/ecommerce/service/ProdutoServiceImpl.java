package br.com.pards.ecommerce.service;

import br.com.pards.ecommerce.dao.ProdutoDAO;
import br.com.pards.ecommerce.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProdutoServiceImpl implements IProdutoService{

    @Autowired
    private ProdutoDAO dao;

    @Override
    public ArrayList<Produto> recuperarTodos() {
//        return (ArrayList<Produto>) dao.findAll();
//        return dao.findByOrderByPreco();
//        return dao.findByOrderByPrecoDesc();
        return dao.findByNameContaining("Console");
    }
    @Override
    public Produto recuperarPeloCodigo(Integer codigo) {

        return dao.findById(codigo).orElse(null);
    }

    @Override
    public Produto cadastrarNovo(Produto novo) {

        return dao.save(novo);
    }

    @Override
    public ArrayList<Produto> buscarPorPalavraChave(String palavra) {
        return dao.findByNameContaining(palavra);
    }
}
