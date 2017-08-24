package br.com.poo.exercicio01.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.poo.exercicio01.entidades.Produto;

public class PovoadorProduto {
	static int contador = 0;

	public static Produto povoarProduto() {
		Random r = new Random();
		contador++;
		Integer nome = 1000 + r.nextInt() * 9000;
		Produto produto = new Produto(nome);
		return produto;
	}

	public static List<Produto> povoarProdutos(int quantidade) {
		List<Produto> produtos = new ArrayList<>();

		for (int i = 0; i < quantidade; i++) {
			Produto produto = povoarProduto();
			produtos.add(produto);
		}
		return produtos;

	}
}
