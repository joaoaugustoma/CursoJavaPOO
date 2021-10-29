import java.util.Scanner;

public class TesteExceptionFinally {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um valor do tipo inteiro: ");

        int valor;

        try {
            valor = teclado.nextInt();
            System.out.println("Você digitou: " + valor);
        }catch (java.util.InputMismatchException e){
            System.out.println("O valor digitado não é inteiro");
        }finally {
            System.out.println("Zerando a variável");
            valor = 0;
        }

        System.out.println(valor);
    }
}
