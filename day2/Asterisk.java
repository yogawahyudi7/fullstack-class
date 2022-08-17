import java.util.Scanner;

public class Asterisk {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        var N = input.nextInt();
        input.close();

        System.out.println("user input : " + N);

        for (int i = 1; i <= N; i++) {
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            if (i == N) break;
            System.out.println();
            
        }


    }
}
