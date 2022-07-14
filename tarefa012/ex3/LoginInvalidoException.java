package br.ufg.inf.ex3;


public class LoginInvalidoException extends Exception {
    public LoginInvalidoException(String errorMessage) {
        super(errorMessage);
    }
}
