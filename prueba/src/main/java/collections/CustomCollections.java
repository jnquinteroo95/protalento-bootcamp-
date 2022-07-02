package collections;

public class CustomCollections<T> {

	T[] cliente;
	int index = 0;

	public CustomCollections(int size) {
		cliente = (T[]) new Object[size];
	}

	public void mostrar() {
		for (T d : cliente) {
			System.out.println(d);
		}
	}

	public void add(T c) {
		cliente[index] = c;
		index++;
	}

	public void addS(int index, T c) {
		for (int i = 0; i < cliente.length; i++) {
			if (cliente[i] == cliente[index]) {
				cliente[index] = c;
			}
		}
	}

	public T get(int index) {
		return cliente[index];
	}

	public T set(int index, T c) {
		cliente[index] = c;
		return cliente[index];
	}

	public T remove(int index) {
		cliente[index] = null;
		return cliente[index];
	}

}

