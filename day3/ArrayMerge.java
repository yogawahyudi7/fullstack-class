import java.util.HashMap;
import java.util.Map;

public class ArrayMerge {
    public static void main(String[] args) {
        
        int[] arr1 =  {1,2,3};
        int[] arr2 =  {1,2,2,7};
       
        int[] res = new int[arr1.length + arr2.length];


        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            res[i + arr1.length] = arr2[i];
        }

        Map<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < res.length; i++) {
            if (map.get(res[i]) == null) {
                map.put(res[i], true);
            }
        }

        System.out.println(map.keySet());
    }
}
