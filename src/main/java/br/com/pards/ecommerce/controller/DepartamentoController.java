package br.com.pards.ecommerce.controller;


import br.com.pards.ecommerce.model.Departamento;
import br.com.pards.ecommerce.service.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class DepartamentoController {

    @Autowired  //faz a injecao de dependencias
    private IDepartamentoService service;

    @GetMapping("/departamentos")
    public ArrayList<Departamento> recuperarTodos(){
        return service.buscarTodos();
    }

    @PostMapping("/departamentos")
    public ResponseEntity<Departamento> incluirNovo(@RequestBody Departamento novo){
        Departamento res = service.criarNovo(novo);
        if(res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/departamentos")
    public ResponseEntity<Departamento> alterarDados(@RequestBody Departamento dados){
        Departamento res = service.atualizarDados(dados);
        if(res != null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/departamentos/{id}")
    public ResponseEntity<Departamento> excluirDepartamento(@PathVariable Integer id){
        service.excluirDepartamento(id);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/departamentos/{numero}")
    public ResponseEntity<Departamento> buscarPeloId(@PathVariable Integer numero){
        Departamento res = service.buscarPeloId(numero);
        if(res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }
}
