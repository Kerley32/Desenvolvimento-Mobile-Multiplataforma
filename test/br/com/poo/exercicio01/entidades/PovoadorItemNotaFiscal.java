package br.com.poo.exercicio01.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PovoadorItemNotaFiscal {
	static int contador = 0;

	public static ItemNotaFiscal povoarItemNotaFiscal() {
		Random r = new Random();
		contador++;

		Integer quantidade = r.nextInt(50);
		Double valorUnitario = 1 + r.nextDouble() * 50;
		Produto produto = PovoadorProduto.povoarProduto();
		ItemNotaFiscal item = new ItemNotaFiscal(quantidade, valorUnitario, produto);

		return item;
	}

	public static List<ItemNotaFiscal> povoarItensNotaFiscal(Integer quantidade) {
		List<ItemNotaFiscal> itens = new ArrayList<>();

		for (int i = 0; i < quantidade; i++) {
			ItemNotaFiscal item = povoarItemNotaFiscal();
			itens.add(item);
		}
		return itens;
	}
}
