public class Conta {
    private int numeroConta;
    private Cliente titular;
    private double saldo;

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

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if(valor > 0){
            this.saldo = valor;
        }
    }

    public boolean sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(Conta contaDestino, double valor){
        if(saldo >= valor){
            saldo -=valor;
            contaDestino.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public void imprime() {
        System.out.println(numeroConta);
        System.out.println(titular.getNome());
        System.out.println(titular.getCpf());
        System.out.println(saldo);

    }
}
