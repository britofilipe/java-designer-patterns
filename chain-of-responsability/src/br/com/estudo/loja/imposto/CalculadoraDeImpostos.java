package br.com.estudo.loja.imposto;

import java.math.BigDecimal;

import br.com.estudo.loja.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
