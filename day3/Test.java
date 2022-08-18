

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Iterable<Integer> names = List.of(100, 200, 300, 400);


        for ( var name : names) {
            System.out.println(name);
        }
    }
}
