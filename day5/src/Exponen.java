public class Exponen {

    static void fastExp(int number, int n) {
        double halfValue = (double)n /2 ;
        double res = Math.pow((number * number), halfValue);

        System.out.println(res);
    }
}


