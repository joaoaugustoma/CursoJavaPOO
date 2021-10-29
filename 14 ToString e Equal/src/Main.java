public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Filme");
        /*
        filme.setCodigo(123);
        filme.setValor(3.5);
        filme.setDisponivel(true);
        */

        Filme filme2 = new Filme();
        filme2.setNome("Filme");
        /*
        filme2.setCodigo(321);
        filme2.setValor(4.5);
        filme2.setDisponivel(true);
         */

        String nomeDoFilme = "Filme";

        if(filme.equals(filme2)){
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }
    }
}
