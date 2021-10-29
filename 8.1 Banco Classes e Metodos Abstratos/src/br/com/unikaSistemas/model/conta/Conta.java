package br.com.unikaSistemas.model.conta;

public abstract class Conta {
    protected int numeroConta;
    protected Cliente titular;
    protected double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public abstract double getSaldo();

    public abstract void depositar(double valor);

    public abstract void sacar(double valor) throws SaldoInsuficienteException;

    public abstract boolean transferir(Conta contaDestino, double valor);

    public void imprime() {
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Nome do Titular: " + titular.getNome());
        System.out.println("CPF: " + titular.getCpf());
        System.out.println("Saldo: " + saldo);
    }

}
