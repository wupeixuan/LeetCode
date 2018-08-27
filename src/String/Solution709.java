package String;

/**
 * 709. To Lower Case（转换成小写字母）
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 */
public class Solution709 {
    public static void main(String[] args) {
        Solution709 solution709 = new Solution709();
        String str = "Hello";
        System.out.println(solution709.toLowerCase(str));
    }

    public String toLowerCase(String str) {
        char[] s = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (s[i] >= 'A' && s[i] <= 'Z') {
                s[i] += 32;
            }
        }
        return new String(s);
    }
}
