package br.com.sistema.controller;

import br.com.sistema.model.Cliente;
import br.com.sistema.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.util.List;

@Named
@ViewScoped
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	private List<Cliente> clientes;

	private Cliente cliente =  new Cliente();

	private boolean modoEdicao=false;

	@PostConstruct
	public void init() {
		setClientes(clienteRepository.buscarTodos());
	}
	
	public void salvar(){
		
		clienteRepository.save(cliente);
		if(!isModoEdicao())
			clientes.add(cliente);
		cliente = new Cliente();
		setModoEdicao(false);
	}

	public void excluir(Cliente cliente){
		clienteRepository.delete(cliente);
		clientes.remove(cliente);
	}
	
	public void editar(Cliente cliente){
		setCliente(cliente);
		setModoEdicao(true);
	}
	
	public void cancelar(){
		cliente = new Cliente();
		setModoEdicao(false);
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean isModoEdicao() {
		return modoEdicao;
	}

	public void setModoEdicao(boolean modoEdicao) {
		this.modoEdicao = modoEdicao;
	}

}
