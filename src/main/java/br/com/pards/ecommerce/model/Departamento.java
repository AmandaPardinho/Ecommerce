package br.com.pards.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.List;


@Entity  //indica que a classe eh armazenavel no banco
@EntityScan(basePackages = {"br.com.pards.ecommerce.model.Departamento"})
@Table(name = "departamento")  //torna explicito o nome da tabela a qual corresponde esta classe
public class Departamento {
    @Column(name = "numero")  //torna explicito o nome da coluna a qual corresponde esse atributo
    @Id  //identifica que esse atributo eh uma primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identifica que esse atributo eh auto increment
    private Integer numero;
    @Column(name = "nome", length = 30, nullable = false)
    private String nome;
    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("departamento")
    private List<Produto> listaProdutos;


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {

        this.numero = numero;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}

