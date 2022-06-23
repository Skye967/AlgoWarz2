public class RemoveChars {
    public static void main(String[] args){
        System.out.println(remove(" Ma Bad "));
    }

    public static String remove(String str) {
        return str.trim().replaceAll("^.|.$", "");
    }
}
