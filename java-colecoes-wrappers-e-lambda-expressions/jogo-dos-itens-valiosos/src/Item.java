import java.util.Comparator;

public class Item {
	private int numero;
	private String nome;
	private int preco;
	private int pontuacao;

	public Item(int numero, String nome, int preco, int pontuacao) {
		this.numero = numero;
		this.nome = nome;
		this.preco = preco;
		this.pontuacao = pontuacao;
	}

	@Override
	public String toString() {
		return "Item [numero=" + numero + ", nome=" + nome + ", preco=" + preco + ", pontuacao=" + pontuacao + "]";
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public int getPreco() {
		return preco;
	}

	public int getPontuacao() {
		return pontuacao;
	}

}

class ItemComparator implements Comparator<Item> {
	@Override
	public int compare(Item item1, Item item2) {
		return Integer.compare(item1.getPontuacao(), item2.getPontuacao());
	}

}
