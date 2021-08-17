package src;

public class Main {

	public static void main(String args[]) {
		System.out.println("\f");
		ListaTelefonica lt = new ListaTelefonica();
		
		System.out.println();
		System.out.println("Inserindo contatos:");
		System.out.println();
		
		lt.add(new Contato("igor", "12345678"));
		lt.add(new Contato("donald", "98765432"));
		lt.add(new Contato("huguinho", "11111111"));
		lt.add(new Contato("zezinho", "22222222"));
		lt.add(new Contato("luizinho", "33333333"));
		lt.add(new Contato("mickey", "44444444"));
		lt.add(new Contato("pluto", "55555555"));
		lt.add(new Contato("minnie", "66666666"));
		lt.add(new Contato("daisy", "77777777"));
		lt.add(new Contato("pateta", "88888888"));
		lt.add(new Contato("jorginho", "00000000"));
		lt.print();
		
		System.out.println();
		System.out.println("removendo o último:");
		System.out.println();
		
		
		lt.removerUltimo();
		lt.print();
		
		
		System.out.println();
		System.out.println("removendo o terceiro:");
		System.out.println();
		
		lt.removerPorIndice(2);
		lt.print();
		
		System.out.println();
		System.out.println("removendo o primeiro:");
		System.out.println();
		
		lt.removerPorIndice(0);
		lt.print();
	}
	
}
