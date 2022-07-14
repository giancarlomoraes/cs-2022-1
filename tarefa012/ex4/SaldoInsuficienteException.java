package br.ufg.inf.ex4;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String errorMessage) {
        super(errorMessage);
    }
}
