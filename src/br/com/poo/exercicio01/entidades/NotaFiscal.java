package br.com.poo.exercicio01.entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private Calendar dataEmissao;
	private List<ItemNotaFiscal> itens = new ArrayList<>();
	private Cliente cliente;

	public NotaFiscal(Calendar dataEmissao, List<ItemNotaFiscal> itens, Cliente cliente, Produto produto) {
		// super();
		this.dataEmissao = dataEmissao;
		this.itens = itens;
		this.cliente = cliente;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public List<ItemNotaFiscal> getItens() {
		return itens;
	}

	public void setItens(List<ItemNotaFiscal> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotaFiscal other = (NotaFiscal) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (dataEmissao == null) {
			if (other.dataEmissao != null)
				return false;
		} else if (!dataEmissao.equals(other.dataEmissao))
			return false;
		if (itens == null) {
			if (other.itens != null)
				return false;
		} else if (!itens.equals(other.itens))
			return false;
		return true;
	}

	public Double calcularValorTotal() {
		Double valorTotal = 0.00;
		for (ItemNotaFiscal itemNotaFiscal : itens) {
			valorTotal += itemNotaFiscal.calcularValorTotal();
		}
		return valorTotal;
	}

}
