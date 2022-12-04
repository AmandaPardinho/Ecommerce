package br.com.pards.ecommerce.service;


import br.com.pards.ecommerce.model.Produto;

import java.util.ArrayList;

public interface IProdutoService {
    public ArrayList<Produto> recuperarTodos();
    public Produto recuperarPeloCodigo(Integer codigo);
    public Produto cadastrarNovo(Produto novo);
    public ArrayList<Produto> buscarPorPalavraChave(String palavra);
}
