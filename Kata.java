public class Kata {
    public static void main(String[] args){
        System.out.println(makeNegative(27));
        System.out.println(makeNegative(-4));
    }

    public static int makeNegative(final int x) {
    
        return -Math.abs(x);
        
      }
}
