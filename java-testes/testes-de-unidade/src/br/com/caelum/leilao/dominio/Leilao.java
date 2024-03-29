package br.com.caelum.leilao.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leilao {
	private String descricao;
	private List<Lance> lances;

	public Leilao(String descricao) {
		this.descricao = descricao;
		this.lances = new ArrayList<Lance>();
	}

	public void propoe(Lance lance) {
		if (lances.isEmpty() || usuarioPodeDarLance(lance.getUsuario())) {
			lances.add(lance);
		}
	}

	private boolean usuarioPodeDarLance(Usuario usuario) {
		int ultimo = lances.size() - 1;
		if (!lances.get(ultimo).getUsuario().equals(usuario)) {
			return true;
		}
		return false;
	}

	public void dobraLance(Usuario usuario) {
		if (!lances.isEmpty() && usuarioPodeDarLance(usuario)) {
			int ultimo = lances.size() - 1;
			double valorDoLance = lances.get(ultimo).getValor() * 2;
			lances.add(new Lance(usuario, valorDoLance));
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public List<Lance> getLances() {
		return Collections.unmodifiableList(lances);
	}

}
