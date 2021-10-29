public abstract class Funcionario {
    protected String nome;
    protected String departamento;
    protected double salario;
    protected String dataEntrada;
    protected String rg;
    protected boolean estaEmpregado;

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

    public abstract boolean calculaSalario(double horaExtra);

    public abstract boolean calculaSalario();

    public abstract double bonifica();

    public void demite() {
        estaEmpregado = false;
    }

    public double calculaGanhoAnual(){
        return salario * 12;
    }
}
