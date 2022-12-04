package br.com.pards.ecommerce.dao;

import br.com.pards.ecommerce.dto.FaturamentoMensal;
import br.com.pards.ecommerce.model.Pedido;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface PedidoDAO extends CrudRepository<Pedido, Integer> {

    /*@Query("SELECT new "
            + "br.com.pards.ecommerce.dto.FaturamentoMensal(munth(p.data), sum(p.valorFinal) "
            + "FROM Pedido p "
            + "WHERE year(p.data) = :ano "
            + "GROUP BY month(p.data) "
            + "ORDER BY month(p.data) ")
    public ArrayList<FaturamentoMensal> recuperarFaturamentoPorAno(@Param("ano") Integer ano);*/
}
