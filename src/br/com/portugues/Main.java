package br.com.portugues;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Program program = new Program();

		String entrada = sc.nextLine();

		entrada = entrada.toLowerCase();

		program.calculate(entrada);

		System.out.print(program.getTotalCaracteres() + " caracteres, ");
		System.out.print(program.getTotalSpaces() + " espaços em branco, ");
		System.out.print(program.getTotalVogais() + " vogal(is).");

		sc.close();

	}

}
