class Filme {
  int codigo;
  String nome;
  double valor;
  boolean disponibilidade;
  
  void locar(){
    disponibilidade = false;
  }

  void devolver(){
    disponibilidade = false;
  }
}

class Locadora {
  public static void main(String[] args){
    Filme filme = new Filme();
    filme.codigo = 123;
    filme.nome = "Filme";
    filme.valor = 3.5;
    filme.disponibilidade = true;

    if(filme.disponibilidade == true){
      filme.locar();
      System.out.println("O filme foi locado!");
    } else {
      System.out.println("O filme não está disponível!");
    }
    
    if(filme.disponibilidade == false){
      filme.devolver();
      System.out.println("O filme foi devolvido!");
    } else {
      System.out.println("O filme não pode ser devolvido!");
    }
    
    System.out.println(filme);
    System.out.println(filme.codigo);
    System.out.println(filme.nome);
    System.out.println(filme.valor);

  }
}