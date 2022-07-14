package br.ufg.inf.ex4;

public class Ex4 {

    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaBancaria cb = new ContaBancaria(999D);

        try{
            cb.sacar(1000D);
        }catch (SaldoInsuficienteException err){
            System.out.println(err.getMessage());
        }
    }

}
