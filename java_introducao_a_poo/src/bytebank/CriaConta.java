package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 1000;
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 200;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 150;

		System.out.println("primeira conta tem " + primeiraConta.saldo);
		System.out.println("segunda conta tem " + segundaConta.saldo);

		primeiraConta.agencia = 126;
		segundaConta.agencia = 146;

		System.out.println("primeira conta está na agência " + primeiraConta.agencia);
		System.out.println("segunda conta está na agência " + segundaConta.agencia);

		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}

	}
}
