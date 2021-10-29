public class Programa {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Augusto");
        cliente.setCpf("702.443.921-37");

        Conta conta = new Conta();

        conta.setNumeroConta(1);
        conta.setTitular(cliente);
        conta.depositar(200);

        conta.imprime();
    }
}
