package testes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Encadeada.Celular;
import sequencial.FilaSequencial;

class FilaSequencialTeste {

	public FilaSequencial filaSequencial;
	public Celular celular = new Celular();
	public Celular celularNull;

	@BeforeEach
	void setUp() throws Exception {
		filaSequencial = new FilaSequencial();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void adicionarNullTest() {
		assertThrows(IllegalArgumentException.class, () -> filaSequencial.enqueue(celularNull));
	}
	
	@Test
	void adicionarCelularTest() {
		filaSequencial.enqueue(celular);
		assertTrue(filaSequencial.lista[0] == celular);
	}
	
	@Test
	void adicionarCelularesTest() {
		filaSequencial.enqueue(celular);
		filaSequencial.enqueue(celular);
		filaSequencial.enqueue(celular);
		assertTrue(filaSequencial.lista[2] == celular);
	}
	
	@Test
	void removerCelularTest() {
		filaSequencial.enqueue(celular);
		assertTrue(filaSequencial.dequeue() == celular || filaSequencial.dequeue() == null);
	}
	
	@Test
	void tamanhoDalistaTeste() {
		assertEquals(0, filaSequencial.size());
	}
	
	@Test
	void tamanhoDalistaTeste2() {
		filaSequencial.enqueue(celular);
		filaSequencial.enqueue(celular);
		filaSequencial.enqueue(celular);
		filaSequencial.enqueue(celular);
		assertEquals(4, filaSequencial.size());
	}
	
	@Test
	void retornarPrimeiroItemTeste() {
		filaSequencial.enqueue(celular);
		assertEquals(celular , filaSequencial.getFront());
	}
	
	@Test
	void listavaziaTeste() {
		assertTrue(filaSequencial.isEmpty() == true);
	}
	
	@Test
	void listavaziaTeste2() {
		filaSequencial.enqueue(celular);
		assertFalse(filaSequencial.isEmpty() == true);
	}

}
