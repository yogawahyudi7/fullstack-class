import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();

        System.out.println("input user : " + N);

        for (int i = 1; i <= N; i++) {
            for (int j = 1;j <= N; j++){
                System.out.printf("%s\t", (i * j) );
            }
            System.out.println();
        }
    }
}
