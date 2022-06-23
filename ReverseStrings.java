public class ReverseStrings {
    public static void main(String[] args){
        System.out.println(solution("hello"));
    }

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
      }
}
