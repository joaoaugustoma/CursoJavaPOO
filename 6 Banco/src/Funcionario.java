public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean estaEmpregado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isEstaEmpregado() {
        return estaEmpregado;
    }

    public void setEstaEmpregado(boolean estaEmpregado) {
        this.estaEmpregado = estaEmpregado;
    }

    public calculaSalario(double valor){
        this.salario = valor - valor * 0.06;
    }

    public void calculaSalario(double valor, double horaExtra){
        this.salario = (valor - (valor*0.06)) + ((valor/30)/8*horaExtra);
    }

    public void bonifica(double valor){
        salario += valor;
    }

    public void demite() {
        estaEmpregado = false;
    }

    public double calculaGanhoAnual(){
        return salario * 12;
    }
}
