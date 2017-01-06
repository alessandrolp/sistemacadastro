package br.com.sistema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.sistema.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	//@Query("select cli from Cliente cli where cli.email=:email")
	//public Cliente buscarPorEmail(@Param("email") String email);
	
	@Query("select cli from Cliente cli order by cli.nome")
	public List<Cliente> buscarTodos();
}
