class Array {
  public static void main(String[] args) {
    int notas[] = new int[8];

    notas[0] = 10;
    notas[1] = 8;
    notas[2] = 9;
    notas[3] = 7;
    notas[4] = 9;
    notas[5] = 6;
    notas[6] = 10;
    notas[7] = 8;
    
    for(int i =  0; i < notas.length; i++) {
      System.out.println(notas[i]);
    }
  }
}