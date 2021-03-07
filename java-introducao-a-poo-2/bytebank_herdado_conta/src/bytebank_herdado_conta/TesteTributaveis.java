package bytebank_herdado_conta;

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
