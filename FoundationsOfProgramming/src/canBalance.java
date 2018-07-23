public class canBalance {
    public static boolean canBalance(int[] nums) {
        int firstHalf = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int i = 0; i < nums.length - 1; i++) {
            firstHalf += nums[i];
            sum -= nums[i];

            if (firstHalf == sum) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 1};
        System.out.println(canBalance(nums));
    }
}
