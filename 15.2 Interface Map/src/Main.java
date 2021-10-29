import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Filme f1 = new Filme();
        f1.setNome("B");
        f1.setValor(3.5);

        Filme f2 = new Filme();
        f2.setNome("J");
        f2.setValor(4.5);

        Filme f3 = new Filme();
        f3.setNome("D");
        f3.setValor(5.5);

        Map<String, Filme> mapa = new TreeMap<>();
        mapa.put("V", f1);
        mapa.put("J", f2);
        mapa.put("D", f3);

        //System.out.println(mapa.get("Filme"));

        Collection<Filme> filmes = mapa.values();

        for(Filme filme : filmes){
            System.out.println(filme.toString());
        }
    }
}
