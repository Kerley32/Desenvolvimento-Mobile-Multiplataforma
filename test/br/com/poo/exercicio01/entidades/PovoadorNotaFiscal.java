package br.com.poo.exercicio01.entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

public class PovoadorNotaFiscal {
	static int contador = 0;

	public static NotaFiscal povoarNotaFiscal(Integer quatidadeItens) {
		Random r = new Random();
		contador++;

		Calendar dataEmissao = Calendar.getInstance();
		Cliente cliente = PovoadorCliente.povoarCliente();
		Produto produto = PovoadorProduto.povoarProduto();
		List<ItemNotaFiscal> itens = PovoadorItemNotaFiscal.povoarItensNotaFiscal(quatidadeItens);
		NotaFiscal notaFiscal = new NotaFiscal(dataEmissao, itens, cliente, produto);

		return notaFiscal;
	}

	public static List<NotaFiscal> povoarNotasFiscais(Integer quantidadeNotas, Integer qtdItensNotasFiscais) {
		List<NotaFiscal> notas = new ArrayList<>();

		for (int i = 0; i < quantidadeNotas; i++) {
			NotaFiscal nota = povoarNotaFiscal(qtdItensNotasFiscais);
			notas.add(nota);
		}
		return notas;
	}
}
