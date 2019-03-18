package br.com.alura.bytebank.banco.teste;
import br.com.alura.bytebank.banco.modelo.Cliente;
import br.com.alura.bytebank.banco.modelo.Conta;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(234);
		System.out.println(conta.getNumero());

		Cliente cliente = new Cliente();
		cliente.setNome("Ruhan Gonçalves");

		conta.setTitular(cliente);

		System.out.println(conta.getTitular().getNome());

	}
}
