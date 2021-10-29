public class ContaCorrente extends Conta implements ServicoBancario {
    public double getSaldo() {
        return this.saldo -= 0.1;
    }

    public void depositar(double valor) {
        if (valor > 0){
            this.saldo += valor;
            this.saldo -= 0.1;
        }
    }

    public boolean sacar(double valor){
        if(saldo >= valor){
            this.saldo -= valor;
            this.saldo -= 0.1;
            return true;
        } else{
            return false;
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
