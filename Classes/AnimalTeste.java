package POO.Classes;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro cach = new Cachorro ("Thor","latido",4);
		Cavalo cav = new Cavalo ("Slash", "relincho",16);
		Preguica preg = new Preguica ("Raio","indefinido",6);
		
		System.out.println("\nPrimeiro Animal:");
		cach.imprimir();
		cach.correr();
		System.out.println("\nSegundo Animal:");
		cav.imprimir();
		cav.correr();
		System.out.println("\nTerceiro Animal:");
		preg.imprimir();
		preg.subindo();

	}

}
