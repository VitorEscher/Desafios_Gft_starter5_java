package br.com.gft.desafio2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<>();
		
		Aluno aluno1 = new Aluno("00001", 10, 10, 10, 0.8);
		Aluno aluno2 = new Aluno("00010", 5, 5, 10, 0.7);
		Aluno aluno3 = new Aluno("00100", 8, 9, 4, 0.6);
		Aluno aluno4 = new Aluno("01000", 6, 6, 7, 0.2);
		Aluno aluno5 = new Aluno("10000", 1, 1, 2, 1.0);
		
		System.out.println(aluno1.Situacao(aluno1.MediaAluno(aluno1)));
		System.out.println(aluno2.Situacao(aluno2.MediaAluno(aluno2)));
		System.out.println(aluno3.Situacao(aluno3.MediaAluno(aluno3)));
		System.out.println(aluno4.Situacao(aluno4.MediaAluno(aluno4)));
		System.out.println(aluno5.Situacao(aluno5.MediaAluno(aluno5)));
		
		list.add(aluno1);
		list.add(aluno2);
		list.add(aluno3);
		list.add(aluno4);
		list.add(aluno5);
		

	}

}
