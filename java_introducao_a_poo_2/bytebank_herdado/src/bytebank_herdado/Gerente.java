package bytebank_herdado;

public class Gerente extends Funcionario implements Autenticavel {
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public double getBonificacao() {
		return this.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

}
