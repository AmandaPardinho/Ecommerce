package br.com.pards.ecommerce.controller;

import br.com.pards.ecommerce.dto.FaturamentoMensal;
import br.com.pards.ecommerce.model.Pedido;
import br.com.pards.ecommerce.service.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PedidoController {

    @Autowired
    private IPedidoService service;

    @GetMapping("/pedidos/{numero}")
    public ResponseEntity<Pedido> recuperarPeloNumero(@PathVariable Integer numero){
        Pedido res = service.recuperarPeloNumero(numero);
        if(res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/pedidos")
    public ResponseEntity<Pedido> inserirNovoPedido(@RequestBody Pedido novo){
        return ResponseEntity.ok(service.inserirNovoPedido(novo));
    }

    /*@GetMapping("/faturamento/{ano}")
    public ArrayList<FaturamentoMensal> recuperarFaturamento(@PathVariable Integer ano){
        return service.recuperarFaturamento(ano);
    }*/
}
