public class sumNumbers {
    public static int sumNumbers(String str) {
        String temp = "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                temp += str.charAt(i);
            }
            else {
                if (!temp.equals("")) {
                    int number = Integer.parseInt(temp);
                    sum += number;
                }
                temp = "";
            }
        }
        if (!temp.equals("")) {
            int number = Integer.parseInt(temp);
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers("aa11b33"));
    }
}
