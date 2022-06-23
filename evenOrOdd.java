public class evenOrOdd {
    public static void main(String[] args){
        System.out.println("hello");
        System.out.println(even_or_odd(14));
    }
    public static String even_or_odd(int number) {
        
        return number % 2 == 0 ? "Even" : "Odd";
    }
}