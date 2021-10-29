class Conta {
  int numeroConta;
  Cliente titular;
  double saldo;

  boolean saque(double valor){
    if(saldo >= valor){
      saldo -= valor;
      return true;
    } else {
      return false;
    }
  }

  void deposito(double valor){
    saldo += valor;
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
  String nome;
  String cpf;
}

class Funcionario {
  String nome;
  String departamento;
  double salario;
  String dataEntrada;
  String rg;
  boolean estaEmpregado;

  void bonifica(double valor){
    salario += valor;
  }

  void demite(){
    estaEmpregado = false;
  }

  double ganhoAnual(){
    return salario * 12;
  }
}

class Banco {
  public static void main(String[] args){
  
   Cliente cliente = new Cliente();
    cliente.nome = "Augusto";
    cliente.cpf = "714.526.881-21";

    Conta conta = new Conta();
    conta.numeroConta = 1;
    conta.titular = cliente;
    conta.saldo = 2000.00;
    
    Conta conta2 = new Conta();
    conta2.numeroConta = 2;
    conta2.titular = cliente;
    conta2.saldo = 800.00;

    if(conta.saque(200.00) == true){
      System.out.println("Operação realizada com sucesso!");
    }else{
      System.out.println("Operação não realizada com sucesso!");
    };
    conta.deposito(120.00);
    if(conta.transferencia(conta2, 300.0) == true){
      System.out.println("Operação realizada com sucesso!");
    }else{
      System.out.println("Operação não realizada com sucesso!");
    };
    
    System.out.println(conta.numeroConta);
    System.out.println(conta.titular.nome);
    System.out.println(conta.saldo);

    System.out.println(conta2.numeroConta);
    System.out.println(conta2.titular.nome);
    System.out.println(conta2.saldo);
    
    /*
    Funcionario funcionario1 = new Funcionario();

    funcionario1.nome = "Augusto";
    funcionario1.departamento = "TI";
    funcionario1.salario = 1000.0;
    funcionario1.dataEntrada = "25/10/2021";
    funcionario1.rg = "6262984";
    funcionario1.estaEmpregado = true;
    funcionario1.bonifica(200.0);
    funcionario1.demite();

    System.out.println(funcionario1.nome);
    System.out.println(funcionario1.departamento);
    System.out.println(funcionario1.salario);
    System.out.println(funcionario1.dataEntrada);
    System.out.println(funcionario1.rg);
    System.out.println(funcionario1.estaEmpregado);
    System.out.println(funcionario1.ganhoAnual());
    */
  }
}