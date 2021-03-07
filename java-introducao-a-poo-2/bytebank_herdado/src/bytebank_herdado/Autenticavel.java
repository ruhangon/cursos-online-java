package bytebank_herdado;

public abstract interface Autenticavel {
	public abstract boolean autentica(int senha);

	public abstract void setSenha(int senha);

}
