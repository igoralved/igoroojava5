package src;

public class Contato {

	private String nome;
	private String numero;
	
	public Contato(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String toString() {
		return "Contato: " + nome + " número: " + numero;
	}
	
	public void print() {
		System.out.println(toString());
	}
	
}
