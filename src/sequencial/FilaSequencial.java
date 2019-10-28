package sequencial;

import Encadeada.Celular;

public class FilaSequencial {

	private static final int TAM_INICIAL = 3;
	private static final int DOBRO_LISTA = 2;
	public Celular[] lista = new Celular[TAM_INICIAL];
	public int tamanho;

	public void enqueue(Celular cel) {
		verificaArgumento(cel);
		verificarTamanhoLista();
		lista[tamanho] = cel;
		tamanho++;
	}

	public Celular dequeue() {
		Celular removido = null;
		if (tamanho > 0) {
			removido = lista[lista.length - 1];
			lista[lista.length - 1] = null;
			tamanho--;
		}
		return removido;
	}

	public int size() {
		return tamanho;
	}

	public Celular getFront() {
		return lista[0];
	}

	public boolean isEmpty() {
		boolean listaVazia = true;
		if (tamanho > 0) {
			listaVazia = false;
		}
		return listaVazia;
	}

	protected void verificaArgumento(Object obj) {
		if (obj == null) {
			throw new IllegalArgumentException();
		}
	}

	protected void verificarTamanhoLista() {
		if (tamanho == lista.length) {
			Celular[] temp = new Celular[tamanho * DOBRO_LISTA];
			for (int i = 0; i < lista.length; i++) {
				temp[i] = lista[i];
			}
			lista = temp;
		}
	}

}
