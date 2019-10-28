package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Encadeada.Celular;
import Encadeada.FilaEncadeada;

class FilaEncadeadaTeste {

	public FilaEncadeada filaEncadeada;
	public Celular celular = new Celular();
	public Celular celularNull;

	@BeforeEach
	void setUp() throws Exception {
		filaEncadeada = new FilaEncadeada();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void adicionarNullTest() {
		assertThrows(IllegalArgumentException.class, () -> filaEncadeada.enqueue(null));
	}

	@Test
	void AdicionarItemtest() {
		filaEncadeada.enqueue(new Celular());
		assertTrue(filaEncadeada.size() > 0);
	}

	@Test
	void AdicionarItenstest() {
		filaEncadeada.enqueue(new Celular());
		filaEncadeada.enqueue(new Celular());
		assertTrue(filaEncadeada.fim.anterior != null);
	}

	@Test
	void removerItemTest() {
		filaEncadeada.enqueue(new Celular());
		filaEncadeada.enqueue(new Celular());
		assertTrue(filaEncadeada.dequeue() == new Celular() || filaEncadeada.dequeue() == null);
	}

	@Test
	void buscarPrimeiroItemVazioTest() {
		assertTrue(filaEncadeada.getFront() == null);
	}
	
	@Test
	void buscarPrimeiroItemoTest() {
		filaEncadeada.enqueue(new Celular());
		filaEncadeada.enqueue(new Celular());
		assertTrue(filaEncadeada.getFront() == celular || filaEncadeada.getFront() == null);
	}

	@Test
	void listaVaziaTest() {
		assertTrue(filaEncadeada.isEmpty() == true);
	}

	@Test
	void tamanholistaTeste() {
		filaEncadeada.enqueue(new Celular());
		filaEncadeada.enqueue(new Celular());
		assertEquals(2, filaEncadeada.size());
	}

}
