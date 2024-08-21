package br.com.edmar;

public class Execucao {
	public static void main(String[] args) {
		Roupa minhaRoupa = new Roupa("Camisa", "Azul", "P");
		
		System.out.println("Detalhes: " + minhaRoupa.detalhes());
		
		if(minhaRoupa.estaLimpa()) {
			System.out.println("Pode usar!");
		}else {
			System.out.println("Precisa lavar antes!");
		}
	}
}
