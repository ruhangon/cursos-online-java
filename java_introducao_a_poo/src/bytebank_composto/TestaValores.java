package bytebank_composto;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta1 = new Conta(10, 28);
		Conta conta2 = new Conta(11, 29);
		Conta conta3 = new Conta(12, 30);

		System.out.println(Conta.getTotal());

	}
}
