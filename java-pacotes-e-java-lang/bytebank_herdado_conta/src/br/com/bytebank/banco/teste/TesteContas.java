package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(200, 200);
		cc.deposita(200);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);

		cc.transfere(20, cp);

		System.out.println("Conta corrente: " + cc.getSaldo());
		System.out.println("Conta poupança: " + cp.getSaldo());

	}
}
