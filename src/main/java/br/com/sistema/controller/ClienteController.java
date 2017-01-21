package br.com.sistema.controller;

import br.com.sistema.model.Cliente;
import br.com.sistema.model.Contato;
import br.com.sistema.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.util.List;

/**
 * Created by alessandro on 06/01/17.
 */

@Named
@ViewScoped
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    private Cliente cliente = new Cliente();

    private List<Cliente> clientes;

    private Contato contato = new Contato();

    private boolean modoEdicao = false;

    @PostConstruct
    public void init(){
        setClientes(clienteRepository.buscarTodos());
    }

    public void salvar(){
        clienteRepository.save(cliente);
        if(!isModoEdicao()){
            clientes.add(cliente);
        }
        cliente = new Cliente();
        setModoEdicao(false);
    }

    public void excluir(Cliente cliente){
        clienteRepository.delete(cliente);
        clientes.remove(cliente);
    }

    public void editar(Cliente cliente){
        this.cliente = cliente;
        setModoEdicao(true);
    }

    public void cancelar(){
        cliente = new Cliente();
        setModoEdicao(false);
    }

    public void adicionarContato(){
        contato.setCliente(cliente);
        cliente.getContatos().add(contato);
        contato = new Contato();
    }

    public void removerContato(Contato contato){
        cliente.getContatos().remove(contato);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public boolean isModoEdicao() {
        return modoEdicao;
    }

    public void setModoEdicao(boolean modoEdicao) {
        this.modoEdicao = modoEdicao;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}
