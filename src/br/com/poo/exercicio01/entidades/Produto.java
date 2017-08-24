package br.com.poo.exercicio01.entidades;

public class Produto {

	private Integer nome;

	public Produto(Integer nome) {
		// super();
		this.nome = nome;
	}

	public Integer getNome() {
		return nome;
	}

	public void setNome(Integer nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
