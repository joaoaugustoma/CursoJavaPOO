class Conta {
  private int numeroConta;
  private Cliente titular;
  private double saldo;
  private static int contador = 1;

  public Conta(Cliente titular) {
    this.titular = titular;
    this.numeroConta = contador ++;
  }

  public void setNumeroConta() {
    this.numeroConta = numeroConta;
  }

  public int getNumeroConta() {
    return this.numeroConta;
  }
  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public Cliente getTitular() {
    return this.titular;
  }


  public double getSaldo() {
    return saldo;
  }

  boolean saque(double valor){
    if(saldo >= valor){
      saldo -= valor;
      return true;
    } else {
      return false;
    }
  }

  void deposito(double valor){
    if(valor > 0){
      saldo += valor;
    }
  }

  boolean transferencia(Conta contaDestino, double valor){
    if(saldo >= valor){
      saldo -= valor;
      contaDestino.saldo += valor;
      return true;
    } else {
      return false;
    }
  }
}

class Cliente {
  private String nome;
  private String cpf;

  public Cliente(String cpf){
    this.cpf = cpf;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public String getCpf(){
    return this.cpf;
  }
}

class Banco {
  public static void main(String[] args){
  
    Cliente cliente = new Cliente("714.526.881-21");
    cliente.setNome("Augusto");

    Cliente cliente2 = new Cliente("714.526.881-21");
    cliente2.setNome("Joao");

    Conta conta = new Conta(cliente);
    conta.setNumeroConta();
    conta.setTitular(cliente);
    conta.deposito(1000);

    Conta conta2 = new Conta(cliente2);
    conta2.setNumeroConta();
    conta2.setTitular(cliente2);
    conta2.deposito(800.00);
    
    System.out.println(conta.getNumeroConta());
    System.out.println(conta.getTitular().getNome());
    System.out.println(conta.getTitular().getCpf());
    System.out.println(conta.getSaldo());
    
    System.out.println("-------------------------------------------");
    
    System.out.println(conta2.getNumeroConta());
    System.out.println(conta2.getTitular().getNome());
    System.out.println(conta2.getTitular().getCpf());
    System.out.println(conta2.getSaldo());
  }
}