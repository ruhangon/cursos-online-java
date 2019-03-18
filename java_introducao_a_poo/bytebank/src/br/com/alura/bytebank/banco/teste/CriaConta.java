package br.com.alura.bytebank.banco.teste;
import br.com.alura.bytebank.banco.modelo.Conta;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.setSaldo(1000);
		System.out.println(primeiraConta.getSaldo());

		Conta segundaConta = primeiraConta;
		segundaConta.setSaldo(150);

		System.out.println("primeira conta tem " + primeiraConta.getSaldo());
		System.out.println("segunda conta tem " + segundaConta.getSaldo());

		primeiraConta.setAgencia(126);
		segundaConta.setAgencia(146);

		System.out.println("primeira conta está na agência " + primeiraConta.getAgencia());
		System.out.println("segunda conta está na agência " + segundaConta.getAgencia());

		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}

	}
}
