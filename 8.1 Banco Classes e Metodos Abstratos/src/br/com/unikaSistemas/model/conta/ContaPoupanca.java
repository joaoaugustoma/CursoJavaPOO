package br.com.unikaSistemas.model.conta;

import br.com.unikaSistemas.exception.SaldoInsuficienteException;

public class ContaPoupanca extends Conta {

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0){
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
        } else{
            throw new SaldoInsuficienteException("Saldo Insuficiente!");
        }
    }

    public boolean transferir(Conta contaDestino, double valor) {
        if(saldo >= valor){
            saldo -= valor;
            contaDestino.saldo += valor;
            return true;
        } else {
            return false;
        }
    }
}
