package br.ufg.inf.ex1;

public abstract class Animal {

    private String nome;

    private Integer idade;

    public abstract void fazerSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Animal(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
