class Funcionario {
  private String nome;
  private String departamento;
  private double salario;
  private String dataEntrada;
  private String rg;
  private boolean estaEmpregado;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public String getDepartamento() {
    return this.departamento;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getSalario() {
    return this.salario;
  }

  public void setDataEntrada(String dataEntrada) {
    this.dataEntrada = dataEntrada;
  }

  public String getDataEntrada(){
    return this.dataEntrada;
  }

  public void setRg(String rg){
    this.rg = rg;
  }

  public String getRg(){
    return this.rg;
  }

  public void setEstaEmpregado(boolean estaEmpregado){
    this.estaEmpregado = estaEmpregado;
  }

  public boolean getEstaEmpregado(){
    return this.estaEmpregado;
  }

  public void calculaSalario(double valor){
    this.salario = valor-(valor*0.06);
  }

  public void calculaSalario(double valor, double horaExtra){
    double valorHoraExra = (valor/30) / 8 * horaExtra;
    this.salario = valor - (valor *0.06) + valorHoraExra;
  }

  public void bonifica(double valor){
    salario += valor;
  }

  public void demite(){
    estaEmpregado = false;
  }

  public double ganhoAnual(){
    return salario * 12;
  }
}

class Program{
  public static void main(String[] args){
    Funcionario f1 = new Funcionario();
    f1.setRg("123123");
    f1.setSalario(1320.50);
    f1.setDepartamento("TI");
    f1.setNome("Augusto");
    f1.setEstaEmpregado(true);
    f1.setDataEntrada("25/10/2021");

    System.out.println(f1.getNome());
    System.out.println(f1.getRg());
    System.out.println(f1.getDepartamento());
    System.out.println(f1.getSalario());
    System.out.println(f1.getEstaEmpregado());
    System.out.println(f1.getDataEntrada());
  }
}