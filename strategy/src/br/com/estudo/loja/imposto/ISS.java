package br.com.estudo.loja.imposto;

import java.math.BigDecimal;

import br.com.estudo.loja.Orcamento;

public class ISS implements Imposto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.09"));
	}

}
