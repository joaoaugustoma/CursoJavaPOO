public class Main {
    public static void main(String[] args) {
        Runnable  buscandoArquivo = new Runnable() {
            public void run() {
                for (int i = 0; i < 2000; i++){
                    System.out.println("Buscando");
                }
            }
        };

        Runnable  lendoArquivo = new Runnable() {
            public void run() {
                for (int i = 0; i < 2000; i++){
                    System.out.println("Lendo");
                }
            }
        };

        Thread thread = new Thread(buscandoArquivo);
        thread.start();
        Thread thread2 = new Thread(lendoArquivo);
        thread2.start();
    }
}
