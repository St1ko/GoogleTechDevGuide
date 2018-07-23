public class stringSplosion {

    public static String stringSplosion(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            output += str.substring(0, i+1);
        }
        return output;
    }

    public static void main(String[] args) {
       System.out.println(stringSplosion("Test"));
       System.out.println(stringSplosion("Test").substring(0,4));
    }
}

