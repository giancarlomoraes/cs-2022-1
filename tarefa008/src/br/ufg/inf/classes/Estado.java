package br.ufg.inf.classes;

public class Estado {
	
	private String sigla;
	
	String nome;
	
	private Pais pais;

	public Estado(String sigla, String nome, Pais pais) {
		super();
		this.sigla = sigla;
		this.nome = nome;
		this.pais = pais;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
