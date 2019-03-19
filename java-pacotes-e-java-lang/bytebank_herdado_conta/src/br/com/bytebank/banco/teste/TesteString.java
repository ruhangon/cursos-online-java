package br.com.bytebank.banco.teste;

public class TesteString {
	public static void main(String[] args) {
		String nome = "carro";
		System.out.println("Palavra inicial: " + nome);

		String novoReplace = nome.replace('c', 'C');
		System.out.println(novoReplace);

		String novoToUpperCase = nome.toUpperCase();
		System.out.println(novoToUpperCase);

		String novoToLowerCase = nome.toLowerCase();
		System.out.println(novoToLowerCase);

		System.out.println(nome.charAt(1));
		System.out.println(nome.indexOf("rro"));

		String sub = nome.substring(2);
		System.out.println(sub);

		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

	}
}
