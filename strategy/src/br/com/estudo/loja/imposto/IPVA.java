package br.com.estudo.loja.imposto;

import br.com.estudo.loja.Orcamento;
import java.math.BigDecimal;

public class IPVA implements Imposto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
