import java.util.Arrays;
import java.util.stream.Stream;

public class highAndLow {
    public static void main(String[] args){
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    public static String highAndLow(String numbers) {
        String[] str = numbers.split(" ");
        int[] values = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(values);
        var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return String.format("%s %s", values[values.length-1], values[0]);
      }

    private static Stream<String> stream(String[] split) {
        return null;
    }
}
