class Empresa {
  String razaoSocial;
  String cnpj;
  Funcionario funcionarios[];

  void addFuncionario(Funcionario funcionario){
    for(int i=0; i<funcionarios.length; i++){
      if(funcionarios[i] == null){
        funcionarios[i] = funcionario;
        break;
      }
    }
  }
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

class ExercicioArray {
  public static void main(String[] args){
    Empresa empresa = new Empresa();
    empresa.razaoSocial = "Unika Sistemas";
    empresa.cnpj = "123.456.789/0001";
    empresa.funcionarios = new Funcionario[5];

    Funcionario f1 = new Funcionario();
    f1.nome = "Augusto";
    f1.departamento = "TI";
    f1.salario = 1000;
    f1.dataEntrada = "25/10/2021";
    f1.rg = "63.630-46";
    f1.estaEmpregado = true;
    empresa.addFuncionario(f1);

    Funcionario f2 = new Funcionario();
    f2.nome = "Larissa";
    f2.departamento = "RH";
    f2.salario = 2500;
    f2.dataEntrada = "12/08/2018";
    f2.rg = "62.309-26";
    f2.estaEmpregado = true;
    empresa.addFuncionario(f2);

    Funcionario f3 = new Funcionario();
    f3.nome = "Danilo";
    f3.departamento = "Fiscal";
    f3.salario = 4000;
    f3.dataEntrada = "22/10/2012";
    f3.rg = "12.230-16";
    f3.estaEmpregado = true;
    empresa.addFuncionario(f3);

    Funcionario f4 = new Funcionario();
    f4.nome = "Marcelo";
    f4.departamento = "Contabilidade";
    f4.salario = 1800;
    f4.dataEntrada = "05/10/2021";
    f4.rg = "43.612-12";
    f4.estaEmpregado = true;
    empresa.addFuncionario(f4);

    Funcionario f5 = new Funcionario();
    f5.nome = "Fernanda";
    f5.departamento = "Limpeza";
    f5.salario = 1000;
    f5.dataEntrada = "21/01/2021";
    f5.rg = "12.532-26";
    f5.estaEmpregado = true;
    empresa.addFuncionario(f5);

    System.out.println(empresa.razaoSocial);
    System.out.println(empresa.cnpj);
    for(Funcionario f:empresa.funcionarios){      
      System.out.println(f);
      System.out.println(f.nome);
      System.out.println(f.departamento);
      System.out.println(f.dataEntrada);
      System.out.println(f.rg);
      System.out.println(f.estaEmpregado);
      System.out.println(f.salario);
    }
  }
}