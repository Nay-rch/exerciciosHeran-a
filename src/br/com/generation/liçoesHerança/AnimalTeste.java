package br.com.generation.liçoesHerança;

public class AnimalTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cachorro cachorro = new cachorro();
		cavalo cav1 = new cavalo();
		preguiça preg = new preguiça();
		
		cachorro.setNome("Duck");
		cachorro.setIdade(3);
		
		cav1.setNome("Estrelinha");
		cav1.setIdade(10);
		
		preg.setNome("Bell");
		preg.setIdade(4);
		
		System.out.println("Nome: "  + cachorro.getNome());
		System.out.println("Idade: " + cachorro.getIdade());
		cachorro.correr();
		
		System.out.println();
		
		System.out.println("Nome: "  + cav1.getNome());
		System.out.println("Idade: " + cav1.getIdade());
		cav1.correr();
		
		System.out.println();
		
		System.out.println("Nome: "  + preg.getNome());
		System.out.println("Idade: " + preg.getIdade());
		preg.sobeEmArvore();
		
		
		
	}

}
