public class Locadora {
    public static void main(String[] args){
        Filme filme = new Filme();
        filme.setCodigo(123);
        filme.setNome("filme");
        filme.setValor(3.50);
        filme.setDisponibilidade(true);

        /*
        try {
            filme.locar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */

        try {
            filme.devolver();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        filme.imprime();

    }
}
