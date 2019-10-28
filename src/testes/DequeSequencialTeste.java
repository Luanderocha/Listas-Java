package testes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Encadeada.Celular;
import sequencial.DequeSequencial;

class DequeSequencialTeste {

	private DequeSequencial deque;
	public Celular celular = new Celular();
	public Celular celularNull;

	@BeforeEach
	void setUp() throws Exception {
		deque = new DequeSequencial();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void adicionarNuloTeste() {
		assertThrows(IllegalArgumentException.class, () -> deque.insertFront(celularNull));
	}

	@Test
	void adicionarCelularInicioTeste() {
		deque.insertFront(celular);
		assertTrue(deque.dequeSequencial[0] == celular);
	}

	@Test
	void adicionarCelularInicioTeste2() {
		deque.insertFront(celular);
		deque.insertFront(celular);
		deque.insertFront(celular);
		deque.insertFront(celular);
		assertTrue(deque.dequeSequencial[3] == celular);
	}

	@Test
	void adicionarCelularFimTeste() {
		deque.insertLast(celular);
		assertTrue(deque.dequeSequencial[deque.size()] == celular);
	}

	@Test
	void adicionarCelularFimTeste2() {
		deque.insertLast(celular);
		deque.insertLast(celular);
		deque.insertLast(celular);
		deque.insertLast(celular);
		assertTrue(deque.dequeSequencial[deque.size()] == celular);
	}

	@Test
	void removerCelularInicioTeste() {
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
	void recuperarPrimeiroDaListaTeste() {
		deque.insertFront(celular);
		assertEquals(celular, deque.getFront());
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
