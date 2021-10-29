public class Main {
    public static void main(String[] args) {
        Integer wrapper = new Integer(11);
        int tipoPrimitivo = 10;
        metodo1(tipoPrimitivo);
        metodo2(wrapper);
    }

    static void metodo1(Integer valor){
        System.out.println(valor);
    }

    static void metodo2(int valor){
        System.out.println(valor);
    }
}
