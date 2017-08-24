package br.com.poo.exercicio01.entidades;

import org.junit.Assert;
import org.junit.Test;

public class TesteCliente {

	@Test
	public void testEqualsObject() {
		// fail("Not yet implemented");

		Cliente cliente1 = PovoadorCliente.povoarCliente();

		Cliente cliente2 = PovoadorCliente.povoarCliente();

		Assert.assertEquals(cliente1, cliente2);
	}

}
