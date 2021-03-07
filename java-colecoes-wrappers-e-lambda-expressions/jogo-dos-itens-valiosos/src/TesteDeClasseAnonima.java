import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TesteDeClasseAnonima {
	public static void main(String[] args) {
		Item i1 = new Item(2, "bola", 50, 2);
		Item i2 = new Item(1, "cubo mágico", 15, 1);
		Item i3 = new Item(3, "teclado", 100, 3);
		List<Item> itens = new LinkedList<>();
		itens.add(i1);
		itens.add(i2);
		itens.add(i3);
		itens.forEach((item) -> System.out.println(item));

		itens.sort(new Comparator<Item>() {
			@Override
			public int compare(Item item1, Item item2) {
				return Integer.compare(item1.getNumero(), item2.getNumero());
			}
		});
		itens.forEach((item) -> System.out.println(item));

	}
}
