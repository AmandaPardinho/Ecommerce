package br.com.pards.ecommerce.dao;

import br.com.pards.ecommerce.model.Departamento;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;

@EntityScan(basePackages = {"br.com.pards.ecommerce.dao.DepartamentoDAO"})
public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {

}
