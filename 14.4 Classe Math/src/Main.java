public class Main {
    public static void main(String[] args) {
        final double PI = 3.14;

        double x = 20;
        double y = 30.5;

        double log = Math.log(x);
        System.out.println(log);

        double max = Math.max(x, y);
        System.out.println(max);

        double min = Math.min(x, y);
        System.out.println(min);

        double pow = Math.pow(x, 2);
        System.out.println(pow);

        long round = Math.round(y);
        System.out.println(round);

        double sqrt = Math.sqrt(x);
        System.out.println(sqrt);

        double cos = Math.cos(y);
        System.out.println(cos);

        double sin = Math.sin(y);
        System.out.println(sin);

        double tan = Math.tan(x);
        System.out.println(tan);
    }
}
