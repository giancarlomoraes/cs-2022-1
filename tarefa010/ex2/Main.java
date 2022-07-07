package br.ufg.inf.ex2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Contato c1 = new Contato("Giancarlo Moraes", "giancarlomoraes@discente.ufg.br");
        Contato c2 = new Contato("Gabriel Pires", "gabrielpires@discente.ufg.br");
        Contato c3 = new Contato("Denecley Alvim", "denecleyalvim@discente.ufg.br");
        Contato c4 = new Contato("Fulano de Tal", "fulanodetal@discente.ufg.br");

        agenda.save(c1);
        agenda.save(c2);
        agenda.save(c3);
        agenda.save(c4);

        printaContatos(agenda);

        System.out.println("-----------------------------");

        agenda.deleteByNome("Denecley Alvim");

        printaContatos(agenda);
    }

    public static void printaContatos(Agenda agenda){
        List<Contato> contatos = agenda.findAll();

        contatos.forEach(contato -> {
            System.out.println("Nome: " + contato.getNome() + " , Email: " + contato.getEmail());
        });
    }

}
