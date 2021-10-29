public class Supervisor extends Funcionario implements Autenticavel{
    public boolean calculaSalario(double horaExtra){
        if(this.salario > 3500){
            this.salario = (this.salario - (this.salario*0.15)) + ((this.salario/30)/8*horaExtra);
            return true;
        }else{
            System.out.println("Valores inválidos!");
            return false;
        }
    }

    public boolean calculaSalario(){
        if(this.salario > 1300) {
            this.salario = this.salario - (this.salario * 0.15);
            return true;
        }else{
            System.out.println("Valores inválidos!");
            return false;
        }
    }

    public double bonifica() {
        return 0;
    }

    public boolean autentica(String login, String senha) {
        return false;
    }
}
