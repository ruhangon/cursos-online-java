package br.com.caelum.leilao.servico;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;

public class Avaliador {
	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;
	private double mediaDosLances;
	private List<Lance> maioresLances;

	public void avalia(Leilao leilao) {
		for (Lance lance : leilao.getLances()) {
			if (lance.getValor() > maiorDeTodos)
				maiorDeTodos = lance.getValor();
			if (lance.getValor() < menorDeTodos)
				menorDeTodos = lance.getValor();
		}
		if (leilao.getLances().isEmpty()) {
			maiorDeTodos = 0;
			menorDeTodos = 0;
		}
		descobreOsMaioresLances(leilao);
	}

	public void encontraMedia(Leilao leilao) {
		if (!leilao.getLances().isEmpty()) {
			double somaDosLances = leilao.getLances().stream().mapToDouble(x -> x.getValor()).sum();
			mediaDosLances = somaDosLances / leilao.getLances().size();
		}
	}

	public void descobreOsMaioresLances(Leilao leilao) {
		List<Lance> lancesEmOrdem = new ArrayList<>(leilao.getLances());
		maioresLances = new ArrayList<>();
		lancesEmOrdem.sort((lance1, lance2) -> Double.compare(lance2.getValor(), lance1.getValor()));
		int contTotalDeLances = 4;
		if (leilao.getLances().size() < contTotalDeLances)
			contTotalDeLances = leilao.getLances().size();
		for (int contMaioresLances = 0; contMaioresLances < contTotalDeLances; contMaioresLances++) {
			maioresLances.add(lancesEmOrdem.get(contMaioresLances));
		}
	}

	public double getMaiorLance() {
		return maiorDeTodos;
	}

	public double getMenorLance() {
		return menorDeTodos;
	}

	public double getMediaDosLances() {
		return mediaDosLances;
	}

	public List<Lance> getMaioresLances() {
		return maioresLances;
	}

}
