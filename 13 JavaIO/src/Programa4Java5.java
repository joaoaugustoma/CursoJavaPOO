import java.io.*;

public class Programa4Java5 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("texto.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            OutputStream os = new FileOutputStream("saida.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter gravador = new BufferedWriter(osw);

            String text = br.readLine();
            while(text != null){
                gravador.append(text);
                gravador.newLine();
                text = br.readLine();
            }

            gravador.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
