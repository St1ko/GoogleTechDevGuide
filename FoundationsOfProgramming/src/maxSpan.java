public class maxSpan {

    public static int maxSpan(int[] nums) {
        int maxSpan = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;
            while (nums[i] != nums[j]) {
                j--;
            }

            int span = j - i + 1;
            if (span > maxSpan) {
                maxSpan = span;
            }
        }
        return maxSpan;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 1, 3, 5, 1, 7};
        System.out.println(maxSpan(test));
    }
}
