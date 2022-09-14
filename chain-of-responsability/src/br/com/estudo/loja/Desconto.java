package br.com.estudo.loja;

import java.math.BigDecimal;
import br.com.estudo.loja.desconto.CalculadoraDescontos;
import br.com.estudo.loja.orcamento.Orcamento;

public class Desconto {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 2);
		Orcamento terceiro = new Orcamento(new BigDecimal("500"), 1);

		CalculadoraDescontos calculadora = new CalculadoraDescontos();
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
		System.out.println(calculadora.calcular(terceiro));
	}

}
