package br.com.sistema.controller;

import br.com.sistema.model.Contato;
import br.com.sistema.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 * Created by alessandro on 06/01/17.
 */

@Named
@ViewScoped
public class ContatoController {

    @Autowired
    private ContatoRepository contatoRepository;

    private Contato contato = new Contato();

    public void salvar(){
        contatoRepository.save(contato);
        contato = new Contato();
    }

    public void excluir(){
        contatoRepository.delete(contato);
    }

}
