package Encadeada;

public class PilhaEncadeada {

	public Celular inicio;
	public int tamanho;

	public void push(Celular cel) {
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

	public Celular pop() {
		Celular retorno = null;
		if (tamanho > 0) {
			retorno = inicio;
			inicio = inicio.proximo;
			tamanho--;
		}
		return retorno;
	}

	public Celular top() {
		return inicio;
	}

	public int size() {
		return tamanho;
	}

	public boolean isEmpyt() {
		boolean listaVazia = true;
		if (tamanho > 0) {
			listaVazia = false;
		}
		return listaVazia;
	}

	public void clear() {
		inicio = new Celular();
		inicio.proximo = inicio;
		tamanho = 0;
	}

	protected void verificaArgumento(Object obj) {
		if (obj == null) {
			throw new IllegalArgumentException();
		}
	}

}
