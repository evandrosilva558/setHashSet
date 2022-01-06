package dio.setHashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exec {

	public static void main(String[] args) {
		
		// cria uma lista aleatoria mapeada adicionando objetos com HashSet.
		Set<Carro> hashSetCarros = new HashSet<>();
		
		hashSetCarros.add(new Carro("Fiat"));
		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("Alfa Romeo"));
		hashSetCarros.add(new Carro("Chevrolet"));
		
		// imprime os objetos.
		System.out.println(hashSetCarros);
		
		// cria uma lista ondenada da estrutura de arvore (tree).
		Set<Carro> treeSetCarros = new TreeSet<>();
		
		treeSetCarros.add(new Carro("Fiat"));
		treeSetCarros.add(new Carro("Ford"));
		treeSetCarros.add(new Carro("Alfa Romeo"));
		treeSetCarros.add(new Carro("Chevrolet"));
		
		System.out.println(treeSetCarros);

	}

}
