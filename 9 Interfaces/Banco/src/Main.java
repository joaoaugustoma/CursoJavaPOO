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

        contaCorrente.numeroConta = 1;
        contaCorrente.titular = cliente1;
        contaCorrente.depositar(1000);
        contaCorrente.getSaldo();
        contaCorrente.sacar(200);
        contaCorrente.transferir(contaPoupanca, 100);

        contaPoupanca.numeroConta = 2;
        contaPoupanca.titular = cliente2;
        contaPoupanca.depositar(1000);

        contaCorrente.imprime();
        System.out.println("---------------------------------");
        contaPoupanca.imprime();
    }
}
