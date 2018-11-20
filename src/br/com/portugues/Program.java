package br.com.portugues;

public class Program {

	private int totalCharacters = 0;
	private int totalVowels = 0;
	private int totalSpaces = 0;

	void calculate(String entrada) {

		for (int i = 0; i < entrada.length(); i++) {
			char letter = entrada.charAt(i);

			if (this.whiteSpace(letter)) {
				totalSpaces++;
			}
			if (this.vowel(letter)) {
				totalVowels++;
			}
		}

		totalCharacters = entrada.length() - totalSpaces;
	}

	boolean whiteSpace(Character letter) {
		switch (letter) {
		case ' ':
			return true;
		default:
			return false;
		}
	}

	boolean vowel(Character letter) {
		switch (letter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		default:
			return false;
		}
	}

	public int getTotalCaracteres() {
		return totalCharacters;
	}

	public int getTotalVogais() {
		return totalVowels;
	}

	public int getTotalSpaces() {
		return totalSpaces;
	}

}