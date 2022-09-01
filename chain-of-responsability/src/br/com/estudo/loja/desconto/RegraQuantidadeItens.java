package br.com.estudo.loja.desconto;

import br.com.estudo.loja.Orcamento;

import java.math.BigDecimal;

public class RegraQuantidadeItens extends Desconto {

	public RegraQuantidadeItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

}
