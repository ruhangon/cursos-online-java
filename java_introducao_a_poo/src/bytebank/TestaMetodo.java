package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoRuhan = new Conta();
		contaDoRuhan.saldo = 100;
		contaDoRuhan.deposita(100);

		System.out.println(contaDoRuhan.saldo);

		boolean conseguiuRetirar = contaDoRuhan.saca(40);

		System.out.println(contaDoRuhan.saldo);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(500);

		contaDaMarcela.transfere(200, contaDoRuhan);

		System.out.println("Saldo da conta do Ruhan: " + contaDoRuhan.saldo);
		System.out.println("Saldo da conta da Marcela: " + contaDaMarcela.saldo);

	}
}
