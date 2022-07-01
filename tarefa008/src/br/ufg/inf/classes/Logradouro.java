package br.ufg.inf.classes;

import br.ufg.inf.enums.TipoLogradouro;

public class Logradouro {
	
	private String nome;
	
	private TipoLogradouro tipoLogradouro;
	
	public Logradouro(String nome, TipoLogradouro tipoLogradouro) {
		super();
		this.nome = nome;
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	
	
}
