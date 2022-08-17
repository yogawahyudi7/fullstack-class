import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String N = input.nextLine();
        input.close();

        System.out.println("user input : " + N);

        var vocal = 0;
        var konsonan = 0;
        var karakter = 0;

        String chr = N.replaceAll("\\s+", "").toLowerCase();
        for (int i = 0; i < chr.length(); i++) {
            if (chr.charAt(i) == 'a' || chr.charAt(i) == 'i' || chr.charAt(i) == 'u' || chr.charAt(i) == 'e'
                    || chr.charAt(i) == 'o') {
                karakter++;
                vocal++;
            } else {
                karakter++;
                konsonan++;

            }
        }

        System.out.println("Jumlah vocal = " + vocal);
        System.out.println("Jumlah konsonan = " + konsonan);
        System.out.println("Jumlah karakter = " + karakter);
    }
}