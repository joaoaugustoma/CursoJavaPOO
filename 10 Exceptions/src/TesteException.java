public class TesteException {
    public static void main(String[] args) {
        System.out.println("Inicio do metodo main");
        try {
            metodoA();
        } catch (Exception e) {
            System.out.println("Você tentou acessar um indice inexistente!");
        }
        System.out.println("Fim do metodo main");
    }

    static void metodoA() {
        System.out.println("Inicio metodo A");
        metodoB();
        System.out.println("Fim do metodo A");
    }

    static void metodoB() {
        System.out.println("Inicio metodo B");
        int numeros[] = new int[10];
        for (int i = 0; i < 11; i++) {
            numeros[i] = i * 3;
            System.out.println(numeros[i]);
        }
        System.out.println("Fim do metodo B");
    }
}
