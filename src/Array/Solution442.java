package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 442. Find All Duplicates in an nums（数组中重复的数据）
 * 给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次。
 * 找到所有出现两次的元素。
 */
public class Solution442 {
    public static void main(String[] args) {
        Solution442 solution442 = new Solution442();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> res = solution442.findDuplicates(nums);
        System.out.println(res.toString());
    }

    /**
     * 直接利用hashmap记录出现次数
     *
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int count;
        for (int val :
                nums) {
            if (!map.containsKey(val)) {
                map.put(val, 1);
            } else {
                count = map.get(val);
                map.put(val, ++count);
            }
            if (map.get(val) == 2) {
                res.add(val);
            }
        }
        return res;
    }

    /**
     * 因为数组输入的特点 1<=a[i]<=n,则可以把原数组当hash表用 ，因为原数组是正数，标为负数表示出现过，如果遇到负数就表示第二次出现，就可以找出所有出现过两次的元素
     *
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates_2(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                res.add(Math.abs(index + 1));
            }
            nums[index] = -nums[index];
        }
        return res;
    }
}
