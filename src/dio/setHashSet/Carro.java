package dio.setHashSet;

import java.util.Objects;

// classe Carro implementando Comparable para comparar os objetos seguido de compareto
public class Carro implements Comparable<Carro>{
	

	String marca;
	
	// metodo compareto da implementacao comparable que compara os objetos e define onde sera alocado pela logica passada.
	@Override
	public int compareTo(Carro o) { // compara se uma marca e maior que a outra e aloca conforme o tamnho das Strings implementando valor -1, 1, 0.
		if(this.marca.length() < o.marca.length()) {
			return -1;
		} else if (this.marca.length() > o.marca.length()) {
			return 1;
		} 
		return 0; // os retornos numericos aloca as marcas em ordem de comparacao.
	}
	
	/* compareTo ordenando as Strings em ordem alfabetica
	 * 
	 * @Override
	 * poblic int compareTo(Carro o) {
	 * return this.getMarca().compareTo(o.getMarca());
	 * }
	 * 
	 */
	
	public Carro(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(marca, other.marca);
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + "]";
	}
	
	
}
