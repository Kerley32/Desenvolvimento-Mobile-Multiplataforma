package com.poo.exercicio01.model;

public class ItemNotaFiscal {

	private Integer quantidade;
	private Double valorUnitario;
	private Produto produto;

	
	public ItemNotaFiscal(Integer quantidade, Double valorUnitario, Produto produto) {
//		super();
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double calcularValorTotal() {
		return this.getQuantidade() * this.getValorUnitario();
	}
}
