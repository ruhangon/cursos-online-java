package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100, 200);
		cc.deposita(1000);

		SeguroDeVida sv = new SeguroDeVida();

		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(sv);

		System.out.println("Total de imposto: " + ci.getTotalImposto());

	}
}
