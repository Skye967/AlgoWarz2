import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class mumbling {
    public static void main(String[] args){
        System.out.println(accum("ZpglnRxqenU"));
    }

    public static String accum(String s) {
        AtomicInteger i = new AtomicInteger(0);
        Object[] arr = Arrays.stream(s.split(""))
            .map(x -> x.toUpperCase() + x.toLowerCase().repeat(i.incrementAndGet() - 1))
            .toArray();
        String[] stringArr = Arrays.copyOf(arr, arr.length, String[].class);
        String message = "";
        for(int y = 0; y < arr.length; y++){
            message = message.concat(stringArr[y]);
            if(y < arr.length -1){
                message = message.concat("-");
            }
        }
        return message;
       }
}
