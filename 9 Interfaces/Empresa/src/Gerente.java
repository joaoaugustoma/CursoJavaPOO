public class Gerente extends Funcionario implements Autenticavel {
    public double bonifica(){
        return this.salario * 0.15;
    }

    public boolean calculaSalario(double horaExtra){
        if(this.salario > 1300){
            this.salario = (this.salario - (this.salario*0.11)) + ((this.salario/30)/8*horaExtra);
            return true;
        }else{
            System.out.println("Valores inválidos!");
            return false;
        }
    }

    public boolean calculaSalario(){
        if(this.salario > 1300) {
            this.salario = this.salario - (this.salario * 0.11);
            return true;
        }else{
            System.out.println("Valores inválidos!");
            return false;
        }
    }

    public boolean autentica(String login, String senha) {
       return false;
    }
}
