import java.util.Scanner;

public class ButtonLamp {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();
        
        System.out.println("user input : " + N);

        boolean Lamp = false;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                if (Lamp == false) {
                    Lamp = true;
                }else  {
                    Lamp = false;
                }
            }
        }

        var result = "";
        if (Lamp == true) {
            result = "LAMPU HIDUP";
        }else {
            result = "LAMPU MATI";
        }
        System.out.println(result);
    }
}
