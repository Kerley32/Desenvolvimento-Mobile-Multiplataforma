/**
 * 
 */
package br.com.poo.exercicio01.entidades;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * @author kerley
 *
 */
public class TesteNotaFiscal {

	/**
	 * Test method for
	 * {@link br.com.poo.exercicio01.entidades.NotaFiscal#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		// setup
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(5);

		NotaFiscal notaFiscal2 = PovoadorNotaFiscal.povoarNotaFiscal(5);

		// assert
		assertEquals(notaFiscal1, notaFiscal2);
	}

	/**
	 * Test method for
	 * {@link br.com.poo.exercicio01.entidades.NotaFiscal#calcularValorTotal()}.
	 */
	@Test
	public void testCalcularValorTotal() {
		// Povoando uma nota fiscal com 5 itens
		NotaFiscal notaFiscal = PovoadorNotaFiscal.povoarNotaFiscal(5);

		// Alterando o valor unitario e quantidade do item apenas para passar
		// teste
		for (ItemNotaFiscal item : notaFiscal.getItens()) {
			item.setQuantidade(1);
			item.setValorUnitario(20.00);

		}

		// execução
		Double total = notaFiscal.calcularValorTotal();

		// assert
		assertEquals(100, total, 0);

	}

}
