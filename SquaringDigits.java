import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SquaringDigits {
    public static void main(String[] args){
        System.out.println(squareDigits(9119));
    }

    public static int squareDigits(int n) {
        int[] digits =  Integer.toString(n).chars().map(c -> c-'0').toArray();
        String numString = "";
        for( int d : digits){
            numString=numString.concat(String.valueOf(d*d));
        }
        int result = Integer.valueOf(numString);
        int tests = Integer.parseInt(String.valueOf(n).chars()
        .map(x -> Integer.parseInt(String.valueOf((char) x)))
        .map(y -> y * y).mapToObj(String::valueOf)
        .collect(Collectors.joining("")));
        
        return result;
      }
}
