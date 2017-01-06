package br.com.sistema.repository;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class TestClienteRepository {

	@Autowired
	 ClienteRepository clienteRepository;
	
	@Autowired
	EntityManager entityManager;
	/*
	@Test
	public void testSalvar(){
	
		Cliente cliente = new Cliente("meirieli");
		Cliente cliSalvo = clienteRepository.save(cliente);
		Assert.assertNotNull(cliSalvo.getId());
		
	}

	@Test
	public void testBuscarPorEmail(){
		Cliente cliente = new Cliente("meirieli");
		entityManager.persist(cliente);
		
		//Cliente cliEncontrado = clienteRepository.buscarPorEmail("jao@htcursos.com");
		
		//assertThat(cliEncontrado.getNome()).isEqualTo(cli.getNome());
	}
	
	@Test
	public void testBuscarTodos(){
		Cliente cliMeiri = new Cliente("meirieli");
		entityManager.persist(cliMeiri);
		
		Cliente cliAlessandro = new Cliente("alessandro");
		entityManager.persist(cliAlessandro);
		
		List<Cliente> lista = clienteRepository.buscarTodos();
		assertThat(lista.get(0).getNome()).isEqualTo(cliMeiri.getNome());
		assertThat(lista.get(1).getNome()).isEqualTo(cliAlessandro.getNome());
		
	}
	*/
	
}
