import java.util.StringTokenizer;

public class Programa {
    public static void main(String[] args) {
        /*
        StringBuffer a,b,c;
        a = new StringBuffer();
        System.out.println(a.capacity());

        b = new StringBuffer("Eduardo");
        System.out.println(b.capacity());

        c = new StringBuffer(50);
        System.out.println(c.capacity());

        StringBuffer nome = new StringBuffer("Joao");
        nome.append(" Augusto");

        System.out.println(nome);

        StringBuffer nome = new StringBuffer("Agusto");
        nome.insert(1, "u");
        System.out.println(nome);

        StringBuffer nome = new StringBuffer("Augustooo");
        nome.delete(7, 9);
        System.out.println(nome);

        StringBuffer nome = new StringBuffer("Augusto");
        nome.deleteCharAt(3);
        System.out.println(nome);

        StringBuffer nome = new StringBuffer("Augusto");
        nome.replace(0, 3, "Rob");
        System.out.println(nome);
         */

        //String Tokenizer

        /*
        StringTokenizer x;
        String token;
        x = new StringTokenizer("25/10/2021", "/");

        while (x.hasMoreTokens()) {
            token = new String(x.nextToken());
            System.out.println(token);
        }
        */

        StringTokenizer y;
        String token;
        y = new StringTokenizer("AB CD EF");

        while (y.hasMoreTokens()) {
            token = new String(y.nextToken());
            System.out.println(token);
        }
    }
}
