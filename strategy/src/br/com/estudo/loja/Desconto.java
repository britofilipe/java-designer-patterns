package br.com.estudo.loja;

import java.math.BigDecimal;
import br.com.estudo.loja.imposto.*;

public class Desconto {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("200"));
		Orcamento segundo = new Orcamento(new BigDecimal("1000"));
		Orcamento terceiro = new Orcamento(new BigDecimal("500"));

		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(primeiro, new IPVA()));
		System.out.println(calculadora.calcular(segundo, new ICMS()));
		System.out.println(calculadora.calcular(terceiro, new ISS()));
		System.out.println(calculadora.calcular(terceiro, new IPTU()));

	}

}
