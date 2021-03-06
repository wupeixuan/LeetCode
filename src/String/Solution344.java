package String;

import java.util.Stack;

/**
 * 344. Reverse String（反转字符串）
 * 编写一个函数，其作用是将输入的字符串反转过来。
 */
public class Solution344 {
    public static void main(String[] args) {
        Solution344 solution344 = new Solution344();
        String s = "hello";
        System.out.println(solution344.reverseString_4(s));
    }

    /**
     * 逆序拼接字符串
     *
     * @param s
     * @return
     */
    public String reverseString(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            str.append(s.charAt(i));
        }
        return String.valueOf(str);
    }

    /**
     * 依次交换两边的值
     *
     * @param s
     * @return
     */
    public String reverseString_2(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    /**
     * 直接调用StringBuilder 的 reverse（）
     *
     * @param s
     * @return
     */
    public String reverseString_3(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * 用栈来实现反转
     *
     * @param s
     * @return
     */
    public String reverseString_4(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        String res = "";
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }
        for (int i = 0; i < chars.length; i++) {
            res += stack.pop();
        }
        return res;
    }
}
