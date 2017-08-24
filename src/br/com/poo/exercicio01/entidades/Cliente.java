package com.poo.exercicio01.model;

import java.util.Calendar;

public class Cliente {

	private String nome;
	private Calendar dataNascimento;

	
	public Cliente(String nome, Calendar dataNascimento) {
//		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
