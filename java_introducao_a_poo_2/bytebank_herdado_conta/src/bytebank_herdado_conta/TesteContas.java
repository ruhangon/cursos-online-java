package bytebank_herdado_conta;

public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(200, 200);
		cc.deposita(200);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);

		cc.transfere(50, cp);

		System.out.println("Conta corrente: " + cc.getSaldo());
		System.out.println("Conta poupança: " + cp.getSaldo());

	}
}
