package br.ufg.inf.ex4;

public class ContaBancaria {

    private Double saldo;

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public void sacar(Double valor) throws SaldoInsuficienteException {
        if(valor > this.getSaldo()){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }

        this.saldo -= valor;
    }

    public ContaBancaria(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
