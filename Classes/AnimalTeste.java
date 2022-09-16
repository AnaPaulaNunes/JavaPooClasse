package POO.Classes;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro cach = new Cachorro ("Thor","latido",4);
		Cavalo cav = new Cavalo ("Slash", "relincho",16);
		Preguica preg = new Preguica ("Raio","grito",6);
		
		System.out.println("\nPrimeiro Animal:");
		cach.imprimir();
		cach.barulho(null);
		cach.correr();
		System.out.println("\nSegundo Animal:");
		cav.imprimir();
		cav.barulho(null);
		cav.correr();
		System.out.println("\nTerceiro Animal:");
		preg.imprimir();
		preg.barulho(null);
		preg.subindo();

	}

}
