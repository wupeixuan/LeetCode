package Array;

import java.util.Arrays;

/**
 * 561. Array Partition I（数组拆分 I）
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 */
public class Solution561 {
    public static void main(String[] args) {
        Solution561 solution561 = new Solution561();
        int[] nums = {1, 4, 3, 2};
        System.out.println(solution561.arrayPairSum(nums));
    }

    /**
     * 分组之后min(ai, bi)的和最大，同组两个数相差越小越好，所以需要先对数组进行排序后，再取偶数位的和即可。
     *
     * @param nums
     * @return
     */
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
