package bytebank_composto;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(234);
		System.out.println(conta.getNumero());

		Cliente cliente = new Cliente();
		cliente.setNome("Ruhan Gon�alves");

		conta.setTitular(cliente);

		System.out.println(conta.getTitular().getNome());

	}
}
