public class getMiddle {
    public static void main(String[] args){
        System.out.println(getMiddle("Ready"));
        System.out.println(getMiddle("Readable"));
    }

    public static String getMiddle(String word) {
        boolean isEven = word.length() % 2 == 0;
        return isEven == true ? word.substring((word.length()/2 - 1), (word.length()/2+1)) 
        : word.substring((word.length()/2), (word.length()/2 + 1));
      }
}
