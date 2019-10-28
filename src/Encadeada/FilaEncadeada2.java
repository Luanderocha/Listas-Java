package Encadeada;

public class FilaEncadeada2 {

	public FilaEncadeada fila;
	public int tamanho;
	public Celular inicio;

	public void enqueue(Celular cel) {
		fila.verificaArgumento(cel);
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

	public Celular dequeue() {
		Celular elemento = null;
		if (inicio != null) {
			Celular temp = inicio.proximo;
			elemento = inicio;
			inicio = temp;
			tamanho--;
		}
		return elemento;
	}
	
	public Celular front() {
		return inicio;
	}
	
	public int size() {
		return tamanho;
	}
	
	public boolean isEmpty() {
		boolean listaVazia = false;
		if(tamanho == 0) {
			listaVazia = true;
		}
		return listaVazia;
	}

}
