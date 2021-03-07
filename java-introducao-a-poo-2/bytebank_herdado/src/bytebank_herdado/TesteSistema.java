package bytebank_herdado;

public class TesteSistema {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setSenha(2222);

		Gerente g2 = new Gerente();
		g2.setSenha(1234);

		SistemaInterno si = new SistemaInterno();
		si.autentica(g1);
		si.autentica(g2);

		Administrador ad = new Administrador();
		ad.setSenha(2222);

		si.autentica(ad);

		Cliente cl = new Cliente();
		cl.setSenha(2222);

		si.autentica(cl);

	}
}
