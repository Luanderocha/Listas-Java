package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Encadeada.Celular;
import Encadeada.PilhaEncadeada;

class PilhaEncadeadaTeste {

	private PilhaEncadeada pilha;
	public Celular celular = new Celular();
	public Celular celularNull;

	@BeforeEach
	void setUp() throws Exception {
		pilha = new PilhaEncadeada();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void inserirNuloTeste() {
		assertThrows(IllegalArgumentException.class, () -> pilha.push(celularNull));
	}

	@Test
	void adicionarCelularTeste() {
		pilha.push(celular);
		assertTrue(pilha.inicio == celular);
	}

	@Test
	void adicionarCelularesTeste() {
		pilha.push(celular);
		pilha.push(celular);
		assertTrue(pilha.inicio == celular);
	}

	@Test
	void removerCelularTeste() {
		pilha.push(celular);
		pilha.push(celular);
		assertEquals(celular, pilha.pop());
	}

	@Test
	void retornarTopoDaListaTeste() {
		pilha.push(celular);
		pilha.push(celular);
		assertEquals(celular, pilha.top());
	}

	@Test
	void tamanhoDalista() {
		assertEquals(0, pilha.size());
	}

	@Test
	void tamanhoDalista2() {
		pilha.push(celular);
		pilha.push(celular);
		assertEquals(2, pilha.size());
	}

	@Test
	void tamanhoDalista3() {
		pilha.push(celular);
		pilha.push(celular);
		pilha.push(celular);
		pilha.pop();
		assertEquals(2, pilha.size());
	}

	@Test
	void verificarListavazia() {
		assertTrue(pilha.isEmpyt() == true);
	}

	@Test
	void verificarListavazia2() {
		pilha.push(celular);
		assertFalse(pilha.isEmpyt() == true);
	}

	@Test
	void limparListateste() {
		pilha.push(celular);
		pilha.push(celular);
		pilha.clear();
		assertTrue(pilha.top() == null && pilha.tamanho == 0);
	}

}
