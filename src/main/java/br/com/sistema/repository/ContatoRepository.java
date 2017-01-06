package br.com.sistema.repository;

import br.com.sistema.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by alessandro on 06/01/17.
 */

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
