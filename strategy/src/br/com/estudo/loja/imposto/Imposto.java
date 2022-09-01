package br.com.estudo.loja.imposto;

import java.math.BigDecimal;
import br.com.estudo.loja.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);

}
