package br.com.estudo.loja.desconto;

import java.math.BigDecimal;

import br.com.estudo.loja.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new RegraQuantidadeItens(
				new RegraValor(
						new SemDesconto()));
		return desconto.calcular(orcamento);
	}

}
