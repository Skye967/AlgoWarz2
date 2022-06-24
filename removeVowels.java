public class removeVowels {
    public static void main(String[] args){
        System.out.println(disemvowel("sfdvavnioe[O]"));
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[\\aeiouAEIOU]", "");
    }
}
