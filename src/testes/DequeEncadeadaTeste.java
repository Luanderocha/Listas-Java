package testes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Encadeada.Celular;
import Encadeada.DequeEncadeada;

class DequeEncadeadaTeste {

	private DequeEncadeada deque;
	public Celular celular = new Celular();
	public Celular celularNull;

	@BeforeEach
	void setUp() throws Exception {
		deque = new DequeEncadeada();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void adicionarNuloteste() {
		assertThrows(IllegalArgumentException.class, () -> deque.insertFront(celularNull));
	}

	@Test
	void adicionarCelularInicioTeste() {
		deque.insertFront(celular);
		assertTrue(deque.inicio == celular);
	}

	@Test
	void adicionarCelularInicioTeste2() {
		deque.insertFront(celular);
		deque.insertFront(celular);
		assertTrue(deque.inicio.proximo == celular);
	}

	@Test
	void adicionarCelularFimTeste() {
		deque.insertLast(celular);
		assertTrue(deque.inicio == celular);
	}

	@Test
	void adicionarCelularFimTeste2() {
		deque.insertLast(celular);
		deque.insertLast(celular);
		assertTrue(deque.inicio.proximo == celular);
	}

	@Test
	void removerCelularInicioteste() {
		deque.insertFront(celular);
		deque.insertFront(celular);
		assertEquals(celular, deque.deleteFront());
	}

	@Test
	void removerCelularFimTeste() {
		deque.insertFront(celular);
		deque.insertFront(celular);
		assertEquals(celular, deque.deleteLast());
	}


	@Test
	void recuperarInicioTeste() {
		deque.insertFront(celular);
		assertEquals(celular, deque.getFront());
	}

	@Test
	void verificartamanholistaTeste() {
		deque.insertFront(celular);
		deque.insertFront(celular);
		assertEquals(2, deque.size());
	}

	@Test
	void verificarListaVaziaTeste() {
		assertTrue(deque.isEmpty() == true);
	}

	@Test
	void verificarListaVaziaTeste2() {
		deque.insertFront(celular);
		assertFalse(deque.isEmpty() == true);
	}

}
