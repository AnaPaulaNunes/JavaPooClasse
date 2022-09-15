package POO.Classes;

public class Preguica extends Animal {
	
	public Preguica (String nome, String som, int idade) {
		super(nome, som, idade);
		
	}
	
	public void subindo() {
		System.out.println(getNome()+" está subindo em uma árvore.");
		
	}
	
	public void imprimir() {
		System.out.println("\nNome da preguiça: "+getNome()+"\nIdade: "+getIdade()+" anos"+
	"\nSom emitido: "+getSom());
	}

}
