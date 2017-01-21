package br.com.sistema.model;

import javax.persistence.*;

/**
 * Created by alessandro on 14/01/17.
 */

@Entity
public class Contato {

    @Id
    @GeneratedValue
    private Long id;

    private String descricao;

    @ManyToOne
    @JoinColumn
    private Cliente cliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
