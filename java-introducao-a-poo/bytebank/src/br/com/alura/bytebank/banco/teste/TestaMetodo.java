package br.com.alura.bytebank.banco.teste;
import br.com.alura.bytebank.banco.modelo.Conta;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoRuhan = new Conta();
		contaDoRuhan.setSaldo(100);
		contaDoRuhan.deposita(100);

		System.out.println(contaDoRuhan.getSaldo());

		boolean conseguiuRetirar = contaDoRuhan.saca(40);

		System.out.println(contaDoRuhan.getSaldo());

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(500);

		contaDaMarcela.transfere(200, contaDoRuhan);

		System.out.println("Saldo da conta do Ruhan: " + contaDoRuhan.getSaldo());
		System.out.println("Saldo da conta da Marcela: " + contaDaMarcela.getSaldo());

	}
}
