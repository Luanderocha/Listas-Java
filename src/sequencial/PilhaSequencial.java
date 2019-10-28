package sequencial;

import Encadeada.Celular;

public class PilhaSequencial {

	private static final int TAM_INICIAL = 3;
	private static final int DOBRO_LISTA = 2;
	public Celular[] pilhaSequencial = new Celular[TAM_INICIAL];
	public int tamanho;

	public void push(Celular cel) {
		verificaArgumento(cel);
		verificarTamanhoLista();
		Celular[] temp = pilhaSequencial;
		for(int i = 1 ; i < pilhaSequencial.length ; i++) {
			pilhaSequencial[i] = temp[i -1];
		}
		pilhaSequencial[0] = cel;
		tamanho++;
	}
	
	public Celular pop() {
		Celular celular = null;
		if(tamanho > 0) {
			celular = pilhaSequencial[0]; 
			Celular[] temp = pilhaSequencial;
			for(int i = 1 ; i < pilhaSequencial.length; i++) {
				pilhaSequencial[i -1] = temp[i];
			}
			tamanho--;
		}
		return celular;
	}
	
	public Celular top() {
		return pilhaSequencial[0];
	}
	
	public int size() {
		return tamanho;
	}
	
	public void clear() { 
		pilhaSequencial = new Celular[TAM_INICIAL];
		tamanho = 0;
	}

	protected void verificaArgumento(Object obj) {
		if (obj == null) {
			throw new IllegalArgumentException();
		}
	}

	protected void verificarTamanhoLista() {
		if (tamanho == pilhaSequencial.length) {
			Celular[] temp = new Celular[tamanho * DOBRO_LISTA];
			for (int i = 0; i < pilhaSequencial.length; i++) {
				temp[i] = pilhaSequencial[i];
			}
			pilhaSequencial = temp;
		}
	}

}
