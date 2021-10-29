public class Estoquista extends Funcionario implements Autenticavel {

    public boolean calculaSalario(double horaExtra) {
        return false;
    }

    public boolean calculaSalario() {
        return false;
    }

    public double bonifica() {
        return 0;
    }

    @Override
    public boolean autentica(String login, String senha) {
        return false;
    }
}
