package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");

		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);

		// Apenas a classe Curso deve ter acesso �s aulas
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		// tentando adicionar da maneira "antiga". Podemos fazer isso? Teste:
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));

		System.out.println(javaColecoes.getAulas());
	}

}
