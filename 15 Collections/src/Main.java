import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Filme f1 = new Filme();
        f1.setCodigo(3);
        f1.setNome("Transformers 3");
        f1.setValor(4.50);

        Filme f2 = new Filme();
        f2.setCodigo(2);
        f2.setNome("A Era do Gelo");
        f2.setValor(2.50);

        Filme f3 = new Filme();
        f3.setCodigo(1);
        f3.setNome("Velozes e Furiosos 7");
        f3.setValor(6.50);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(f1);
        filmes.add(f2);
        filmes.add(f3);

        Collections.sort(filmes);

        for(Filme filme : filmes) {
            System.out.println("--------------------------------------");
            System.out.println("Codigo: " + filme.getCodigo());
            System.out.println("Filme:" + filme.getNome());
            System.out.println("Valor: R$" + filme.getValor());
        }
    }
}














