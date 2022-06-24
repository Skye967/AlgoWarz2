import java.util.Arrays;
import java.util.stream.Stream;

public class wordSpinner {
    public static void main(String[] args){
        System.out.println(spinWords("Hey fellow worriors"));
    }

    public static String spinWords(String sentence) {
        String[] arr = sentence.split(" ");
        for(int y = 0; y < arr.length; y++){
            if( arr[y].length() >= 5){
                StringBuffer i = new StringBuffer(arr[y]);
                arr[y] = String.valueOf(i.reverse());
            }
            System.out.println(arr[y]);
        }
        String result = String.join(" ", arr);

        return result;
      }
}
