package br.com.sistema.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome; 

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	private List<Contato> contatos = new ArrayList<>();

	public Cliente(){
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public Cliente(String nome) {
		setNome(nome);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
