package br.ufg.inf.interfaces;

import br.ufg.inf.classes.Endereco;

public interface IEndereco {
	
	Endereco consultaPorCep(String query);
	
}
