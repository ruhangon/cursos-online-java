package bytebank_herdado;

public class SistemaInterno {
	private int senha = 2222;

	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if (autenticou == true) {
			System.out.println("autenticação permitida");
		} else {
			System.out.println("autenticação negada");
		}
	}

}
