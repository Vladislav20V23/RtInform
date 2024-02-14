import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task {

    public static void main(String[] args){

        int[] array = {1,3,4,5,1,5,4};
        System.out.println(Arrays.toString(array));

        Map<Integer, Integer> mapArray = new HashMap<>();
        for (int x : array) {
            if (mapArray.containsKey(x)) {
                Integer y = mapArray.get(x);
                mapArray.put(x, y+1);
            } else {
                mapArray.put(x, 1);
            }
        }
        System.out.println(mapArray);
    }

}
