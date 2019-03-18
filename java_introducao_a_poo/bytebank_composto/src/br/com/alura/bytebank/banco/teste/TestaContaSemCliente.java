package br.com.alura.bytebank.banco.teste;
import br.com.alura.bytebank.banco.modelo.Conta;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());

	}
}
