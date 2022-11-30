package br.com.pards.ecommerce.controller;

import br.com.pards.ecommerce.model.Produto;
import br.com.pards.ecommerce.service.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProdutoController {

    @Autowired
    private IProdutoService service;

    //recuperar tudo
    @GetMapping
    public ArrayList<Produto> recuperarTodoMundo(){
        return service.recuperarTodos();
    }

    //recuperar pelo id
    @GetMapping("/produtos/{codigo}")
    public ResponseEntity<Produto> recuperarPeloCodigo(@PathVariable Integer codigo){
        Produto res = service.recuperarPeloCodigo(codigo);
        if(res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.status(404).build();
    }

    //recuperar por palavra-chave
    @GetMapping("/produtos/busca")
    public ArrayList<Produto> recuperarPorPalavraChave(@RequestParam (name = "palavra") String palavra){
        return service.buscarPorPalavraChave(palavra);
    }

    //cadastrar
    @PostMapping("/produtos")
    public ResponseEntity<Produto> inserirNovoProduto(@RequestBody Produto novo){
        Produto res = service.cadastrarNovo(novo);
        if(res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

}
