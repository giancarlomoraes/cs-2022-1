package br.ufg.inf.classes;

import java.util.Date;
import java.util.List;

public class PessoaFisica {
	
	private String nome;
	
	private String sexo;
	
	private Date dataNascimento;
	
	private List<Endereco> endereco;

	public PessoaFisica(String nome, String sexo, Date dataNascimento, List<Endereco> endereco) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	
}
