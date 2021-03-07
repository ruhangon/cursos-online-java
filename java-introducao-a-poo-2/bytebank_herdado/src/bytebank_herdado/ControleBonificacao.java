package bytebank_herdado;

public class ControleBonificacao {
	private double soma;

	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma += boni;
	}

	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

}
