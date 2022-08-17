import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();

        String result = "";


        System.out.println("user input : " + N);

       
        if (N % 2 == 0 || N <= 1){
            result = "BILANGAN NON PRIMA";
        }else {
            result = "BILANGAN PRIMA";
        }
            
        System.out.println(result);
        
    }
}
