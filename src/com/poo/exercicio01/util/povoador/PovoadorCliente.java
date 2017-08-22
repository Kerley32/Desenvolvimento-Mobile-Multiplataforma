package com.poo.exercicio01.util.povoador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

import com.poo.exercicio01.model.Cliente;

public class PovoadorCliente {
	static int contador = 0;

	public static Cliente povoarCliente() {
		Random r = new Random();
		contador++;

		Integer ano = 1900 + r.nextInt() * 2017;
		Integer mes = 1 + r.nextInt() * 12;
		Integer dia = 1 + r.nextInt() * 30;

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
