package bytebank_herdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		Designer func1 = new Designer();
		func1.setNome("Ruhan");
		func1.setCpf("111.111.111-11");
		func1.setSalario(2000);

		System.out.println("Nome: " + func1.getNome());
		System.out.println("CPF: " + func1.getCpf());
		System.out.println("Sal�rio: " + func1.getSalario());
		System.out.println("Bonifica��o em cima do sal�rio atual: " + func1.getBonificacao());

	}
}
