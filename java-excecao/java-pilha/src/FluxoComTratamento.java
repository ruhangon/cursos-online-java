
public class FluxoComTratamento {
	public static void main(String[] args) {
		System.out.println("In�cio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim do main");

	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("In�cio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("In�cio do metodo2");
		throw new MinhaExcecao("deu errado com a minha nova exce��o");
		// System.out.println("Fim do metodo2");
	}

}
