package br.com.estudo.loja.desconto;

import java.math.BigDecimal;

import br.com.estudo.loja.orcamento.Orcamento;

public class CalculadoraDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new RegraQuantidadeItens(
				new RegraValor(
						new SemDesconto()));
		return desconto.calcular(orcamento);
	}

	public BigDecimal calcularAntigo(Orcamento orcamento) {

		if (orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}

		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}

		return BigDecimal.ZERO;
	}

}

