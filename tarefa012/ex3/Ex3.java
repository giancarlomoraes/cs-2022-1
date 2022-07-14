package br.ufg.inf.ex3;

public class Ex3 {
    public static void main(String[] args) throws LoginInvalidoException {
        Login l = new Login("giancarlomoraes", "senha123");

        try{
            l.fazer_login("giancarlomoraes", "senha1234");
        }catch (LoginInvalidoException err){
            System.out.println(err.getMessage());
        }
    }
}
