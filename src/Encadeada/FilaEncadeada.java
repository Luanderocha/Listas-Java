package Encadeada;


public class FilaEncadeada {

	private int tamanho;
	public Celular fim;
	
	
	public void enqueue(Celular cel) {
		verificaArgumento(cel);
		if (fim == null) {
			fim = cel;
			tamanho++;
		} else {
			Celular temp = fim;
			fim = cel;
			fim.anterior = temp;
			tamanho++;
		}
	}


	public Celular dequeue() {
		Celular removido = null;
		if (fim != null) {
			Celular temp = fim;
			while (temp.anterior != null) {
				temp = temp.anterior;
			}
			removido = temp.anterior;
			temp.anterior = null;
			tamanho--;
		}
		return removido;
	}

	public Celular getFront() {
		Celular primeiroItem = fim;
		if(tamanho > 0) {	
			Celular temp = fim;
			while (temp.anterior != null) {
				temp = temp.anterior;
			}
			primeiroItem = temp;
		}
		return primeiroItem;
	}
	

	public int size() {
		return tamanho;
	}

	public boolean isEmpty() {
		boolean listaVazia = false;
		if (tamanho == 0) {
			listaVazia = true;
		}
		return listaVazia;
	}

	/*
	 * Método que verifica se o Objeto é nulo
	 */
	protected void verificaArgumento(Object obj) {
		if (obj == null) {
			throw new IllegalArgumentException();
		}
	}

}
