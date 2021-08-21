package br.com.caelum.leilao.servico;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;

public class Avaliador {
	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;
	private double mediaDosLances;

	public void avalia(Leilao leilao) {
		for (Lance lance : leilao.getLances()) {
			if (lance.getValor() > maiorDeTodos)
				maiorDeTodos = lance.getValor();
			if (lance.getValor() < menorDeTodos)
				menorDeTodos = lance.getValor();
		}
	}

	public void encontraMedia(Leilao leilao) {
		if (!leilao.getLances().isEmpty()) {
			double somaDosLances = leilao.getLances().stream().mapToDouble(x -> x.getValor()).sum();
			mediaDosLances = somaDosLances / leilao.getLances().size();
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

}
