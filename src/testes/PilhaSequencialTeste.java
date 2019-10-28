package testes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Encadeada.Celular;
import sequencial.PilhaSequencial;

class PilhaSequencialTeste {

	private PilhaSequencial pilha;
	public Celular celular = new Celular();
	public Celular celularNull;

	@BeforeEach
	void setUp() throws Exception {
		pilha = new PilhaSequencial();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void adicionarNullTeste() {
		assertThrows(IllegalArgumentException.class, () -> pilha.push(celularNull));
	}
	
	@Test
	void adicionarCelularTeste() {
		pilha.push(celular);
		assertTrue(pilha.pilhaSequencial[0] == celular);
	}
	
	@Test
	void adicionarCelularTeste2() {
		pilha.push(celular);
		pilha.push(celular);
		pilha.push(celular);
		assertTrue(pilha.pilhaSequencial[2] == celular);
	}
	
	@Test
	void adicionarCelularTeste3() {
		pilha.push(celular);
		pilha.push(celular);
		pilha.push(celular);
		pilha.push(celular);
		assertTrue(pilha.pilhaSequencial[3] == celular);
	}
	
	@Test
	void removerCelularTeste() {
		pilha.push(celular);
		pilha.push(celular);
		pilha.push(celular);
		assertTrue(pilha.pop() == celular);
	}
	
	@Test
	void retornarinicioTeste() {
		pilha.push(celular);
		pilha.push(celular);
		assertEquals(celular, pilha.top());
	}
	
	@Test
	void tamanhoDaLista() {
		assertEquals(0, pilha.size());
	}
	
	@Test
	void tamanhoDaLista2() {
		pilha.push(celular);
		pilha.push(celular);
		assertEquals(2, pilha.size());
	}
	
	@Test
	void tamanhoDaLista3() {
		pilha.push(celular);
		pilha.push(celular);
		pilha.pop();
		assertEquals(1, pilha.size());
	}
	
	@Test
	void limparLista() {
		pilha.push(celular);
		pilha.push(celular);
		pilha.clear();
		assertEquals(0 , pilha.size());
	}
	

}
