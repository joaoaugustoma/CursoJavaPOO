package br.com.unikaSistemas.model.conta;

import br.com.unikaSistemas.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta {
    public double getSaldo() {
        return this.saldo -= 0.1;
    }

    public void depositar(double valor) {
        if (valor > 0){
            this.saldo += valor;
            this.saldo -= 0.1;
        }
    }

    public void sacar(double valor){
        if(saldo >= valor){
            this.saldo -= valor;
            this.saldo -= 0.1;
        } else{
            throw new SaldoInsuficienteException("Saldo Insuficiente!");
        }
        if(valor <= 0){
            throw new IllegalArgumentException("Valor inexistente!");
        }
        if(valor > 2000){
            throw new SaldoInsuficienteException("O valor do saque não pode exceder R$2000,00!");
        }
    }

    public boolean transferir(Conta contaDestino, double valor){
        if(saldo >= valor){
            saldo -= valor;
            contaDestino.saldo += valor;
            contaDestino.saldo -= 0.1;
            return true;
        } else {
            return false;
        }
    }
}
