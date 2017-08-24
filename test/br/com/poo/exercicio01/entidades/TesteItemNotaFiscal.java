package br.com.poo.exercicio01.entidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteItemNotaFiscal {

	@Test
	public void testCalcularValorTotal() {

		// Povoando uma nota fiscal com 5 itens
		ItemNotaFiscal item = PovoadorItemNotaFiscal.povoarItemNotaFiscal();
		// Alterando o valor unitario e quantidade do item para passar teste
		item.setValorUnitario(10.00);
		item.setQuantidade(3);

		// execução
		Double valorTotal = item.calcularValorTotal();

		// assert
		assertEquals(30, valorTotal, 0);

	}

}
