/*
package br.com.unikaSistemas.test;


import br.com.unikaSistemas.exception.SaldoInsuficienteException;
import br.com.unikaSistemas.model.cliente.Cliente;
import br.com.unikaSistemas.model.conta.ContaCorrente;
import br.com.unikaSistemas.model.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        cliente1.setNome("Augusto");
        cliente1.setCpf("702.450.687-21");
        cliente2.setNome("Joao");
        cliente2.setCpf("701.745.632-98");

        contaCorrente.setNumeroConta(1);
        contaCorrente.setTitular(cliente1.nome);
        contaCorrente.depositar(1000);
        contaCorrente.getSaldo();
        contaCorrente.transferir(contaPoupanca, 100);

        try {
            contaCorrente.sacar(2000);
            System.out.println("Saque efetuado!");
        } catch (SaldoInsuficienteException | IllegalArgumentException | SaqueExcedidoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("Aconteceu algo de errado!");
        }

        contaPoupanca.setNumeroConta(2);
        contaPoupanca.titular = cliente2;
        contaPoupanca.depositar(1000);

        contaCorrente.imprime();
        System.out.println("---------------------------------");
        contaPoupanca.imprime();
    }
}


 */