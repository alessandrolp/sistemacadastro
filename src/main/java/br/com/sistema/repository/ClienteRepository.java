package br.com.sistema.repository;

import br.com.sistema.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alessandro on 06/01/17.
 */

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("select c from Cliente c order by c.nome")
    public List<Cliente> buscarTodos();


}
