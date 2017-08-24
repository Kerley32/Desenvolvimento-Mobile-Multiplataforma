package br.com.poo.exercicio01.entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

import br.com.poo.exercicio01.entidades.Cliente;

public class PovoadorCliente {
	static int contador = 0;

	public static Cliente povoarCliente() {
		Random r = new Random();
		contador++;

		Integer ano = 0;
		while (ano < 1917) {
			ano = r.nextInt(2016);
		}
		Integer mes = r.nextInt(12);
		Integer dia = r.nextInt(30);

		// Testar Equals com sucesso.
		// Calendar dataNascimento = new GregorianCalendar(1984, 06, 02);
		// Cliente cliente = new Cliente("Cliente1 ", dataNascimento);

		Calendar dataNascimento = new GregorianCalendar(ano, mes, dia);
		Cliente cliente = new Cliente("Cliente " + contador, dataNascimento);

		return cliente;
	}

	public static List<Cliente> povoarClientes(int quantidade) {
		List<Cliente> clientes = new ArrayList<>();

		for (int i = 0; i < quantidade; i++) {
			Cliente cliente = povoarCliente();
			clientes.add(cliente);
		}
		return clientes;
	}
}
