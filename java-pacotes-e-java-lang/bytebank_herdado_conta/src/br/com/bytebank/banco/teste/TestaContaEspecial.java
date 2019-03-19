package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.especial.ContaEspecial;

public class TestaContaEspecial {
	public static void main(String[] args) {
		ContaEspecial conta = new ContaEspecial(111, 222);
		System.out.println(conta.getSaldo());

	}
}
