package br.com.caelum.leilao.servico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;

public class Testes {
	@Test
	public void deveEntenderLancesEmOrdemCrescente() {
		Usuario joao = new Usuario("Joao");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(maria, 250.0));
		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(jose, 400.0));
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		double maiorEsperado = 400;
		double menorEsperado = 250;
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.0001);
	}

	@Test
	public void deveEntenderLancesEmOrdemDecrescente() {
		Usuario joao = new Usuario("Joao");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(maria, 600.0));
		leilao.propoe(new Lance(joao, 500.0));
		leilao.propoe(new Lance(jose, 400.0));
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		double maiorEsperado = 600;
		double menorEsperado = 400;
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.0001);
	}

	@Test
	public void deveEntenderLeilaoComUmLance() {
		Usuario joao = new Usuario("Joao");
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(joao, 300.0));
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		double esperado = 300;
		assertEquals(esperado, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(esperado, leiloeiro.getMenorLance(), 0.0001);
	}

	@Test
	public void deveEntenderLeilaoSemLances() {
		Leilao leilao = new Leilao("Switch novo");
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		double esperado = 0;
		assertEquals(esperado, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(esperado, leiloeiro.getMenorLance(), 0.0001);
	}

	@Test
	public void deveVerificarMediaDosLances() {
		Usuario joao = new Usuario("Joao");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(maria, 100.0));
		leilao.propoe(new Lance(joao, 200.0));
		leilao.propoe(new Lance(jose, 300.0));
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.encontraMedia(leilao);
		double mediaEsperada = 200.0;
		assertEquals(mediaEsperada, leiloeiro.getMediaDosLances(), 0.0001);
	}

	@Test
	public void deveVerificarMaioresQuandoNaoHouverLances() {
		Leilao leilao = new Leilao("Switch novo");
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		assertEquals(0, leiloeiro.getMaioresLances().size());
	}

	@Test
	public void deveVerificarMaioresQuandoHouverPoucosLances() {
		Usuario joao = new Usuario("Joao");
		Usuario jose = new Usuario("José");
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(joao, 400.0));
		leilao.propoe(new Lance(jose, 500.0));
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		assertEquals(2, leiloeiro.getMaioresLances().size());
		assertEquals(500.0, leiloeiro.getMaioresLances().get(0).getValor(), 0.0001);
		assertEquals(400.0, leiloeiro.getMaioresLances().get(1).getValor(), 0.0001);
	}

	@Test
	public void deveVerificarMaioresQuandoHouverMuitosLances() {
		Usuario joao = new Usuario("Joao");
		Usuario jose = new Usuario("José");
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(joao, 200.0));
		leilao.propoe(new Lance(jose, 400.0));
		leilao.propoe(new Lance(joao, 600.0));
		leilao.propoe(new Lance(jose, 800.0));
		leilao.propoe(new Lance(joao, 900.0));
		leilao.propoe(new Lance(jose, 950.0));
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		assertEquals(4, leiloeiro.getMaioresLances().size());
		assertEquals(950.0, leiloeiro.getMaioresLances().get(0).getValor(), 0.0001);
		assertEquals(900.0, leiloeiro.getMaioresLances().get(1).getValor(), 0.0001);
		assertEquals(800.0, leiloeiro.getMaioresLances().get(2).getValor(), 0.0001);
		assertEquals(600.0, leiloeiro.getMaioresLances().get(3).getValor(), 0.0001);
	}

}
