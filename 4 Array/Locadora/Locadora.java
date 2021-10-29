class Filme {
  int codigo;
  String nome;
  double valor;
}

class Locadora {
  public static void main(String[] args){
    Filme filme = new Filme();
    filme.codigo = 123;
    filme.nome = "Filme";
    filme.valor = 3.5;

    Filme filme2 = new Filme();
    filme2.codigo = 124;
    filme2.nome = "Filme 2";
    filme2.valor = 4.5;

    Filme filme3 = new Filme();
    filme3.codigo = 125;
    filme3.nome = "Filme 3";
    filme3.valor = 5.5;

    Filme filme4 = new Filme();
    filme4.codigo = 126;
    filme4.nome = "Filme 4";
    filme4.valor = 6.5;

    Filme filme5 = new Filme();
    filme5.codigo = 127;
    filme5.nome = "Filme 5";
    filme5.valor = 7.5;

    Filme filmes[] = new Filme[5];
    filmes[0] = filme;
    filmes[1] = filme2;
    filmes[2] = filme3;
    filmes[3] = filme4;
    filmes[4] = filme5;

    for(int i = 0; i < filmes.length; i++) {
      System.out.println(filmes[i]);
      System.out.println(filmes[i].codigo);
      System.out.println(filmes[i].nome);
      System.out.println(filmes[i].valor);
    }
  }
}