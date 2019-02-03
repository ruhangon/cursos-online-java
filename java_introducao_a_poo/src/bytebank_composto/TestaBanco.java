package bytebank_composto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Ruhan Gonçalves");
		cliente1.setCpf("111.111.111-11");
		cliente1.setProfissao("programador");

		Conta contaDoRuhan = new Conta();
		contaDoRuhan.deposita(250);

		contaDoRuhan.setTitular(cliente1);
		System.out.println(contaDoRuhan.getTitular().getNome());

	}
}
