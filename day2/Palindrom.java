import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        input.close();
        
        System.out.println("user input : " + str);
        
        var N = str.replaceAll("\\s+", "") ;
        
        // System.out.println("remove space : " + N);

        var result = "Palindrom";
        
        for (int i = 0; i < N.length() ; i++) {
            if (N.charAt(i) != N.charAt((N.length()-1)-i)) {
                result = "Not Palindrom";
                break;
            }
            
        }

        System.out.println(result);
    }
}
