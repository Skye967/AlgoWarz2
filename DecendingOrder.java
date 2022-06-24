import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DecendingOrder {

    public static void main(String[] args){
        System.out.println(sortDesc(987654321));
    }
    

    public static int sortDesc(final int num) {
         int[] arr = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
         Arrays.sort(arr);
         int[] orderArray = new int[arr.length];
         int n = 0;
         for(int i = arr.length - 1; i >= 0; i--){
            orderArray[i] = arr[n];
            n++;
         }
         String[] stringArr = Arrays.toString(orderArray).split(",");
         String numString = String.join("", stringArr).replaceAll("[^0-9]", "");
         return Integer.parseInt(String.valueOf(num)
         .chars()
         .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
         .sorted(Comparator.reverseOrder())
         .collect(Collectors.joining()));
      }
}
