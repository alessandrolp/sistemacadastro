package br.com.sistema.repository;

import br.com.sistema.model.TipoContato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alessandro on 06/01/17.
 */

@Repository
public interface TipoContatoRepository extends JpaRepository<TipoContato, Integer> {

    @Query("select tc from TipoContato tc order by tc.descricao")
    public List<TipoContato> buscarTodos();
}
