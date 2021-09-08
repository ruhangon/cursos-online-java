package br.com.caelum.leilao.servico;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;

public class TestesDeAvaliador {
	private Avaliador leiloeiro;
	private Usuario joao;
	private Usuario jose;
	private Usuario maria;

	@Test
	public void deveEntenderLancesEmOrdemCrescente() {
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(maria, 250.0));
		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(jose, 400.0));
		leiloeiro.avalia(leilao);
		double maiorEsperado = 400;
		double menorEsperado = 250;
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.0001);
	}

	@Test
	public void deveEntenderLancesEmOrdemDecrescente() {
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(maria, 600.0));
		leilao.propoe(new Lance(joao, 500.0));
		leilao.propoe(new Lance(jose, 400.0));
		leiloeiro.avalia(leilao);
		double maiorEsperado = 600;
		double menorEsperado = 400;
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.0001);
	}

	@Test
	public void deveEntenderLeilaoComUmLance() {
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(joao, 300.0));
		leiloeiro.avalia(leilao);
		double esperado = 300;
		assertEquals(esperado, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(esperado, leiloeiro.getMenorLance(), 0.0001);
	}

	@Test(expected = RuntimeException.class)
	public void naoDeveAvaliarLeilaoSemLances() {
		Leilao leilao = new Leilao("Switch novo");
		leiloeiro.avalia(leilao);
	}

	@Test
	public void deveVerificarMediaDosLances() {
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(maria, 100.0));
		leilao.propoe(new Lance(joao, 200.0));
		leilao.propoe(new Lance(jose, 300.0));
		leiloeiro.encontraMedia(leilao);
		double mediaEsperada = 200.0;
		assertEquals(mediaEsperada, leiloeiro.getMediaDosLances(), 0.0001);
	}

	@Test
	public void deveVerificarMaioresQuandoHouverPoucosLances() {
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(joao, 400.0));
		leilao.propoe(new Lance(jose, 500.0));
		leiloeiro.avalia(leilao);
		assertEquals(2, leiloeiro.getMaioresLances().size());
		assertEquals(500.0, leiloeiro.getMaioresLances().get(0).getValor(), 0.0001);
		assertEquals(400.0, leiloeiro.getMaioresLances().get(1).getValor(), 0.0001);
	}

	@Test
	public void deveVerificarMaioresQuandoHouverMuitosLances() {
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(joao, 200.0));
		leilao.propoe(new Lance(jose, 400.0));
		leilao.propoe(new Lance(joao, 600.0));
		leilao.propoe(new Lance(jose, 800.0));
		leilao.propoe(new Lance(joao, 900.0));
		leilao.propoe(new Lance(jose, 950.0));
		leiloeiro.avalia(leilao);
		assertEquals(4, leiloeiro.getMaioresLances().size());
		assertEquals(950.0, leiloeiro.getMaioresLances().get(0).getValor(), 0.0001);
		assertEquals(900.0, leiloeiro.getMaioresLances().get(1).getValor(), 0.0001);
		assertEquals(800.0, leiloeiro.getMaioresLances().get(2).getValor(), 0.0001);
		assertEquals(600.0, leiloeiro.getMaioresLances().get(3).getValor(), 0.0001);
	}

	@Before
	public void setUp() {
		this.leiloeiro = new Avaliador();
		this.joao = new Usuario("Joao");
		this.jose = new Usuario("José");
		this.maria = new Usuario("Maria");
	}

}
