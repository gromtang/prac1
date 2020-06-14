public class DP {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {

        int len = nums.length;

        int a = 0;
        int b = nums[0];

        for (int i = 1; i < len; i++) {
            int tmp = b;
            b = Math.max(b, a + nums[i]);
            a = tmp;
        }

        return b;

    }
}
