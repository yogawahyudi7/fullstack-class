import java.lang.Math;

public class Number {

    static String primeNumber(int number) {

        int input = (int) Math.sqrt(number);
        String res = "BILANGAN PRIMA";
        if (number < 2) {
            res = "BUKAN BILANGAN PRIMA";
        }
            for (int i = 1; i < input; i++) {
                if (number % 2 == 0) {
                    res = "BUKAN BILANGAN PIRMA";
                    break;
                }
            }
            return res;
    }
}

