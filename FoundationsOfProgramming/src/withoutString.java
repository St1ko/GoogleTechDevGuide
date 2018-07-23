public class withoutString {
    /* Given two strings, base and remove, return a version of the base string where
     * all instances of the remove string have been removed (not case sensitive).
     * You may assume that the remove string is length 1 or more. Remove only non-overlapping
     * instances, so with "xxx" removing "xx" leaves "x".
     *
     * withoutString("Hello there", "llo") → "He there"
     * withoutString("Hello there", "e") → "Hllo thr"
     * withoutString("Hello there", "x") → "Hello there"
     */

    public static String withoutString(String base, String remove) {
        int baselength = base.length();
        int removelength = remove.length();
        String lowB = base.toLowerCase();
        String lowR = remove.toLowerCase();

        String result = "";

        for (int i = 0; i < baselength; i++) {
            if (i <= baselength - removelength) {
                if (!lowB.substring(i, i + removelength).equals(lowR)) {
                    result += base.substring(i, i + 1);
                } else {
                    i += removelength - 1;
                }
            } else {
                if (!lowB.substring(i, i + 1).equals(lowR)) {
                    result += base.substring(i, i + 1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(withoutString("Hello World", "llo"));
    }

}
