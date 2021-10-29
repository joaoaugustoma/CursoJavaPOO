public class Vendedor extends Funcionario {
    public boolean calculaSalario(double horaExtra) {
        if(this.salario<=1300){
            this.salario = (this.salario - (this.salario*0.06)) + ((this.salario/30)/8*horaExtra);
            return true;
        }else{
            System.out.println("Valores inválidos!");
            return false;
        }
    }

    public boolean calculaSalario() {
        if (this.salario <= 1300) {
            this.salario = this.salario - (this.salario * 0.06);
            return true;
        } else {
            System.out.println("Valores inválidos!");
            return false;
        }
    }

    public double bonifica() {
        return this.salario * 0.1;
    }
}
