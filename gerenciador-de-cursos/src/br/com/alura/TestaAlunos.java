package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {

		//Set<String> alunos = new HashSet<>();
		Collection<String> alunos = new HashSet<>(); // método Collection é mais genérico 
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Nico Steppat"); // outro Nico Steppat, exatamente igual ao outro

		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos);
		System.out.println(alunos.size());
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		alunos.remove("Sergio Lopes");
		System.out.println(alunos);
		
		// Podemos transformar o Set em uma List
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println(alunosEmLista);
		System.out.println(alunosEmLista.get(2)); 

	}

}
