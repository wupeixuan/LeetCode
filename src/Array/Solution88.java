package Array;

/**
 * 88. Merge Sorted Array（合并两个有序数组）
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 */
public class Solution88 {
    public static void main(String[] args) {
        Solution88 solution88 = new Solution88();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        solution88.merge(nums1, m, nums2, n);
    }

    /**
     * 从两个数组中的末尾开始进行合并，先找两个数组中较大的移动到正确的位置，将那个移动的位置值向前移动一个位置，再进行同样的操作，直到所有的元素处理完。
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[index--] = nums1[i--];
            } else {
                nums1[index--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[index--] = nums2[j--];
        }
    }
}
