package POO.Classes;

public class Cachorro extends Animal {
	
	public Cachorro (String nome, String som, int idade) {
		super(nome, som, idade);
		
	}
	public void correr() {
	System.out.println(getNome()+ " está correndo.");
	}
	
	public void imprimir() {
		System.out.println("\nNome do cachorro: "+getNome()+"\nIdade: "+getIdade()+" anos"+
	"\nSom emitido: "+getSom());
		
	}
	
	@Override
	public void barulho(String barulho) {
		System.out.println("AU, AU, AAAUUU....");
	}

}
