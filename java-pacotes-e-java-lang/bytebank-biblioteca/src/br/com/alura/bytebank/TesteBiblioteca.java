package br.com.alura.bytebank;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(100, 200);
		conta.deposita(500);
		System.out.println(conta.getSaldo());

	}
}
