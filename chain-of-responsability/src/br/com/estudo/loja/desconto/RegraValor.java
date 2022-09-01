package br.com.estudo.loja.desconto;

import br.com.estudo.loja.Orcamento;

import java.math.BigDecimal;

public class RegraValor extends Desconto {

	public RegraValor(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}

}
