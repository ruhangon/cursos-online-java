package bytebank_herdado;

public class TesteReferencias {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Walter");
		g1.setSalario(5000);
		System.out.println(g1.getNome());

		EditorVideo e1 = new EditorVideo();
		e1.setNome("John");
		e1.setSalario(2500);

		Designer d1 = new Designer();
		d1.setNome("Claudio");
		d1.setSalario(2000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(e1);
		controle.registra(d1);

		System.out.println(controle.getSoma());

	}
}
