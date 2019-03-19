package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestesToString {
	public static void main(String[] args) {
		Object cc = new ContaCorrente(10, 20);
		Object cp = new ContaPoupanca(30, 40);

		System.out.println(cc);
		System.out.println(cp);

	}
}
