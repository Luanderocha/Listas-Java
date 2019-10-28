package Encadeada;

public class DequeEncadeada {

	public Celular inicio;
	public int tamanho;

	public void insertFront(Celular cel) {
		verificaArgumento(cel);
		if (inicio == null) {
			inicio = cel;
			tamanho++;
		} else {
			Celular temp = inicio;
			inicio = cel;
			inicio.proximo = temp;
			tamanho++;
		}
	}

	public void insertLast(Celular cel) {
		verificaArgumento(cel);
		if (inicio == null) {
			inicio = cel;
			tamanho++;
		} else {
			Celular temp = inicio;
			while (temp.proximo != null) {
				temp = temp.proximo;
			}
			temp.proximo = cel;
			tamanho++;
		}
	}

	public Celular deleteFront() {
		Celular elemento = null;
		if (inicio != null) {
			Celular temp = inicio.proximo;
			elemento = inicio;
			inicio = temp;
			tamanho--;
		}
		return elemento;
	}

	public Celular deleteLast() {
		Celular removido = null;
		if (inicio != null) {
			Celular temp = inicio;
			for(int i = 0; i <= tamanho ; i++) {
				temp = temp.proximo;
			}
			removido = temp;
			temp.anterior = null;
			tamanho--;
		}
		return removido;
	}

	public Celular getFront() {
		return inicio;
	}

	public int size() {
		return tamanho;
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

}
