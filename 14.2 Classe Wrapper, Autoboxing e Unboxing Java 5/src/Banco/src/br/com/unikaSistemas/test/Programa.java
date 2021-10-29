package Banco.src.br.com.unikaSistemas.test;

import br.com.unikaSistemas.model.cliente.Cliente;
import br.com.unikaSistemas.model.conta.ContaCorrente;

import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
        cliente.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite seu CPF:")));

        ContaCorrente cc = new ContaCorrente();
        cc.setTitular(cliente);
        cc.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog("Crie o número da sua conta:")));
        cc.depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado:")));
        cc.getSaldo();

        JOptionPane.showMessageDialog(null, "Informacoes da conta:" +
                "\n\nTitular: " + cc.getTitular().getNome() +
                "\nCPF: " + cc.getTitular().getCpf() +
                "\nNum: " + cc.getNumeroConta() +
                "\nSaldo: R$ " + cc.getSaldo());
    }
}
