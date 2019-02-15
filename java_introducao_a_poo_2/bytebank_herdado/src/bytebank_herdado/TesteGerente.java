package bytebank_herdado;

public class TesteGerente {
	public static void main(String[] args) {
		Autenticavel referencia = new Cliente();

		Gerente gerente = new Gerente();
		gerente.setNome("Jonas");
		gerente.setCpf("999999");
		gerente.setSalario(5000);

		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacao());

	}
}
