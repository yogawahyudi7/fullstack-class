import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int N = input.nextInt();
        input.close();
        System.out.println("user input : ");
        System.out.println("X input : " + X);
        System.out.println("N input : " + N);
        int res = 1;

        for (int i = 0; i < N; i++) {
            res = res * X;
        }

        System.out.println(res);
    }
}
