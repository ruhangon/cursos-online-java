package br.com.alura.bytebank.banco.teste;
import br.com.alura.bytebank.banco.modelo.Conta;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.setSaldo(300);

		System.out.println("Saldo da primeira: " + primeiraConta.getSaldo());

		Conta segundaConta = primeiraConta;

		System.out.println("Saldo da segunda: " + segundaConta.getSaldo());

		segundaConta.setSaldo(segundaConta.getSaldo()+100);
		System.out.println("Saldo da primeira: " + primeiraConta.getSaldo());
		System.out.println("Saldo da segunda: " + segundaConta.getSaldo());


		if (primeiraConta == segundaConta) {
			System.out.println("É a mesma conta");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}
}
