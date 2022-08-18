import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AngkaMunculSekali {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String N = input.nextLine();
        input.close();

        System.out.println("user input : "+ N);

        List<Character> res = new ArrayList<Character>();
        
        for (int i = 0; i < N.length(); i++) {
            int counter = 0;
            
            for (int j = 0; j < N.length(); j++) {
                if (N.charAt(i) == N.charAt(j)) {
                    counter++;
                }
                if (counter >= 2) {
                    break;
                }
            }

            if (counter < 2) {
                res.add(N.charAt(i));
            }

        }

        System.out.println(res);
    }
}
