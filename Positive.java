import java.util.Arrays;
import java.util.stream.IntStream;

public class Positive {
    public static void main(String[] args){
        System.out.println(sum(new int[]{1,2,3,4,5}));
        System.out.println(sum(new int[]{1,-2,3,4,5}));
    }
    public static int sum(int[] arr){
        int sum = 0;
        for(int i=0; i < arr.length; i++ ){
            if(arr[i] > 0){
                sum += arr[i];
            }
        }
        IntStream stream = Arrays.stream(arr).filter(y -> y > 0);
        stream.forEach(str -> System.out.println(str));
        return sum;
      }
}
