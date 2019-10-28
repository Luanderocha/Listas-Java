package sequencial;

import Encadeada.Celular;

public class DequeSequencial {
	
	private static final int TAM_INICIAL = 3;
	private static final int DOBRO_LISTA = 2;
	public Celular[] dequeSequencial = new Celular[TAM_INICIAL];
	public int tamanho;
	
	public int size() {
		return tamanho;
	}
	
	public void insertFront(Celular celular) {
		verificaArgumento(celular);
		verificarTamanhoLista();
		Celular[] temp = dequeSequencial;
		for(int i = 1 ; i < dequeSequencial.length ; i++) {
			dequeSequencial[i] = temp[i -1];
		}
		dequeSequencial[0] = celular;
		tamanho++;	
	}
	
	public void insertLast(Celular celular) {
		verificaArgumento(celular);
		verificarTamanhoLista();
		dequeSequencial[tamanho] = celular;
		tamanho++;
	}
	
	public Celular deleteFront() {
		Celular celular = null;
		if(tamanho > 0) {
			celular = dequeSequencial[0]; 
			Celular[] temp = dequeSequencial;
			for(int i = 1 ; i < dequeSequencial.length; i++) {
				dequeSequencial[i -1] = temp[i];
			}
			tamanho--;
		}
		return celular;
	}
	
	public Celular deleteLast() {
		Celular celular = null;
		if(tamanho>0) {
			celular = dequeSequencial[tamanho];
			dequeSequencial[tamanho] = null;
			tamanho--;
		}
		return celular;
	}
	
	public Celular getFront() {
		return dequeSequencial[0];
	}
	
	public boolean isEmpty() {
		return (tamanho > 0) ? false : true;
	}
	
	protected void verificaArgumento(Object obj) {
		if (obj == null) {
			throw new IllegalArgumentException();
		}
	}

	protected void verificarTamanhoLista() {
		if (tamanho == dequeSequencial.length) {
			Celular[] temp = new Celular[tamanho * DOBRO_LISTA];
			for (int i = 0; i < dequeSequencial.length; i++) {
				temp[i] = dequeSequencial[i];
			}
			dequeSequencial = temp;
		}
	}

}
