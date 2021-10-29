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

    public void imprime() {
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Nome do Titular: " + titular.getNome());
        System.out.println("CPF: " + titular.getCpf());
        System.out.println("Saldo: " + saldo );
    }

}
