package br.com.caelum.leilao.servico;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;

public class TestesDeLances {
	private Usuario joao;
	private Usuario jose;
	private Usuario maria;

	@Test
	public void naoDeveAceitarDoisLancesSeguidosDoMesmoUsuario() {
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(joao, 200.0));
		leilao.propoe(new Lance(joao, 400.0));
		assertEquals(1, leilao.getLances().size());
		assertEquals(200, leilao.getLances().get(0).getValor(), 0.0001);
	}

	@Test
	public void deveDobrarUltimoLanceDado() {
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(joao, 400.0));
		leilao.propoe(new Lance(jose, 600.0));
		leilao.dobraLance(joao);
		assertEquals(3, leilao.getLances().size());
		assertEquals(400, leilao.getLances().get(0).getValor(), 0.0001);
		assertEquals(600, leilao.getLances().get(1).getValor(), 0.0001);
		assertEquals(1200, leilao.getLances().get(2).getValor(), 0.0001);
	}

	@Test
	public void naoDeveDobrarLancePorNaoExistirAnterior() {
		Leilao leilao = new Leilao("Switch novo");
		leilao.dobraLance(joao);
		assertEquals(0, leilao.getLances().size());
	}

	@Test(expected = IllegalArgumentException.class)
	public void naoDeveAceitarLanceZerado() {
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(joao, 0.0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void naoDeveAceitarLanceNegativo() {
		Leilao leilao = new Leilao("Switch novo");
		leilao.propoe(new Lance(joao, -200.0));
	}

	@Before
	public void setUp() {
		this.joao = new Usuario("Joao");
		this.jose = new Usuario("José");
		this.maria = new Usuario("Maria");
	}

}
