public interface ServicoBancario {
    double getSaldo();

    void depositar(double valor);

    boolean sacar(double valor);

    boolean transferir(Conta contaDestino, double valor);
}
