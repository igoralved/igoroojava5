package src;

public class ListaTelefonica {

	private int totalcontatos;
	private static final int MAXIMO = 10;
	private Contato[] contatos;
	
	
	public ListaTelefonica() {
		totalcontatos = 0;
		contatos = new Contato[10];
	}
	
	public void add(Contato c) {
		if(isFull()) {
			printFullMessage();
		}else{
			adiciona(c);
		}
	}
	
	private boolean outOfBounds(int index) {
		return index < 0 || index >= totalcontatos;
	}

	public boolean isFull() {
		return totalcontatos == MAXIMO;
	}
	
	public boolean isEmpty() {
		return totalcontatos == 0;
	}
	
	private void adiciona(Contato c) {
		contatos[totalcontatos] = c;
		totalcontatos++;
	}
	
	public void removerUltimo() {
		if(isEmpty()) {
			printEmptyMessage();
		}else {
		remove();
		}
	}

	private void remove() {
		contatos[totalcontatos - 1] = null;
		totalcontatos--;
	}
	
	public void removerPorIndice(int index) {
		if(outOfBounds(index)) {
			printOutOfBoundsMessage(index);
		}
		if(index < totalcontatos - 1){
			removeNoMeio(index);
		}
		remove();
	}
	
	public void print() {
		if(isEmpty()) {
			printEmptyMessage();
		}else {
			for(int i = 0; i < totalcontatos; i++) {
				contatos[i].print();
			}
		}
	}
	
	private void removeNoMeio(int index) {
		for(int i = index; i < totalcontatos-1; i++) {
			contatos[i] = contatos[i+1];
		}
	}
	
	private void printEmptyMessage() {
		System.out.println("Tudo Vazio!");
	}
	
	private void printFullMessage() {
		System.out.println("Tudo cheio!");
	}
	
	private void printOutOfBoundsMessage(int index) {
		System.out.println("Index out of bounds: " + index);
	}
	
}
