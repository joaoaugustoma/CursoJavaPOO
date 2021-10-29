public class ContaPoupanca extends Conta implements ServicoBancario {

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0){
            this.saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if(saldo >= valor){
            saldo -= valor;
            return true;
        } else{
            return false;
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
