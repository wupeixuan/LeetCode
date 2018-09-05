package String;

import java.util.HashMap;

/**
 * 13. Roman to Integer（罗马数字转整数）
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 */
public class Solution13 {
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        String s = "IV";
        System.out.println(solution13.romanToInt(s));
    }

    /**
     * 相同的数字连写，所表示的数等于这些数字相加得到的数，如 Ⅲ=3；
     * 小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数，如 Ⅷ=8、Ⅻ=12；
     * 小的数字（限于 Ⅰ、X 和 C）在大的数字的左边，所表示的数等于大数减小数得到的数，如 Ⅳ=4、Ⅸ=9。
     * 利用 map 来完成罗马数字的 7 个数字符号：I、V、X、L、C、D、M 和整数的映射关系，然后根据上面的解释来模拟完成即可。
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length();
        int res = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res -= map.get(s.charAt(i));
            } else {
                res += map.get(s.charAt(i));
            }
        }
        return res;
    }
}
