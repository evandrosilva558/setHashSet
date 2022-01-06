package dio.setHashSet;

import java.util.HashSet;
import java.util.Set;

public class Exec {

	public static void main(String[] args) {
		
		// criando uma lista aleatoria adicionando objetos com HashSet.
		Set<Carro> hashSetCarros = new HashSet<>();
		
		hashSetCarros.add(new Carro("Fiat"));
		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("Alfa Romeo"));
		hashSetCarros.add(new Carro("Chevrolet"));
		
		// imprime os objetos.
		System.out.println(hashSetCarros);

	}

}
