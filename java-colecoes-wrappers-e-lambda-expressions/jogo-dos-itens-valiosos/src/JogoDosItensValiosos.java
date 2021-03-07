import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JogoDosItensValiosos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Jogo dos itens valiosos");
		System.out.println(
				"Você precisa encontrar o melhor conjunto de itens na lista abaixo, consumindo no máximo 10 pontos");

		Item i1 = new Item(1, "notebook", 4200, 5);
		Item i2 = new Item(2, "celular", 3000, 4);
		Item i3 = new Item(3, "videogame", 2000, 3);
		Item i4 = new Item(4, "televisão", 1550, 2);
		Item i5 = new Item(5, "relógio", 700, 1);

		List<Item> itens = new LinkedList<>();
		itens.add(i1);
		itens.add(i2);
		itens.add(i3);
		itens.add(i4);
		itens.add(i5);

		System.out.println();
		System.out.println("Lista de itens");
		for (Item item : itens)
			System.out.println(item);

		System.out.println();
		System.out.println("Escolha a melhor combinação que conseguir \nAssim que atingir 10 pontos o jogo terminará");
		System.out.println();

		int pontuacaoAtual = 0;
		int seuItem;
		int lucroTotal = 0;
		List<Item> itensEscolhidos = new LinkedList<>();
		do {
			try {
				System.out.println("Escolha um item pelo número:");
				System.out.print("Resposta: ");
				seuItem = scan.nextInt();
				scan.nextLine();
				if (seuItem >= 1 && seuItem <= 5) {
					if ((pontuacaoAtual + itens.get(seuItem - 1).getPontuacao()) <= 10) {
						pontuacaoAtual += itens.get(seuItem - 1).getPontuacao();
						itensEscolhidos.add(itens.get(seuItem - 1));
						lucroTotal += itens.get(seuItem - 1).getPreco();
						// mostra itens
						System.out.println();
						for (Item item : itensEscolhidos)
							System.out.println(item);
						System.out.println("Pontuação atual: " + pontuacaoAtual);
						System.out.println();
					} else if ((pontuacaoAtual + itens.get(seuItem - 1).getPontuacao()) > 10) {
						System.out.println("A pontuação passou de 10, você não pode adicionar esse item");
						continue;
					}
				} else {
					System.out.println("Opção inválida");
				}
			} catch (InputMismatchException e) {
				System.out.println("Opção inválida");
				scan.nextLine();
				seuItem = 0;
			}
		} while (pontuacaoAtual != 10);

		// sem lambda
		// ItemComparator comparator = new ItemComparator();
		// itensEscolhidos.sort(comparator);
		// com lambda
		itensEscolhidos.sort((item1, item2) -> Integer.compare(item1.getPontuacao(), item2.getPontuacao()));

		System.out.println("Abaixo estão os itens que você escolheu");
		// sem lambda
		// for (Item item : itensEscolhidos)
		// System.out.println(item);
		// com lambda
		itensEscolhidos.forEach((item) -> System.out.println(item));

		System.out.println("Lucro total: " + lucroTotal);

		System.out.println("\n\nFim do programa");

	}
}
