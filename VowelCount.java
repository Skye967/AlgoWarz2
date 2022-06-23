import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount {
    public static void main(String[] args){
        System.out.println(getCount("Nasdgerorki!"));
    }

    public static int getCount(String str) {
        Pattern vowels = Pattern.compile("[aeiou]");
        Matcher matcher = vowels.matcher(str);
        long count = matcher.results().count();
        int VowelCount = (int)count;
        return str.replaceAll("[^aeiou]", "").length();
      }
}
