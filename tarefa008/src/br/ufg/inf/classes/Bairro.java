package br.ufg.inf.classes;

public class Bairro {
	
	private String nome;
	
	private Cidade cidade;

	public Bairro(String nome, Cidade cidade) {
		super();
		this.nome = nome;
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
}
