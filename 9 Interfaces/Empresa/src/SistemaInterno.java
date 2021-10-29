public class SistemaInterno {
    public void autenticaUsuario(Autenticavel pessoa){
        String login = "USER";
        String password = "PASSWORD";

        if(pessoa.autentica(login, password)){
            System.out.println("Bem-vindo");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
