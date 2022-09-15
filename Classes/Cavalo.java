package POO.Classes;

public class Cavalo extends Animal {
	
	public Cavalo (String nome, String som, int idade) {
		super (nome, som, idade);
	}
	
	public void correr() {
		System.out.println(getNome()+" está correndo.");
	}
	
	public void imprimir() {
		System.out.println("\nNome do cavalo: "+getNome()+"\nIdade: "+getIdade()+" anos"+
	"\nSom emitido: "+getSom());
	}
}
