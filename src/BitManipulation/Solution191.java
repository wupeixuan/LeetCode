package BitManipulation;

/**
 * 191. Number of 1 Bits（位1的个数）
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 */
public class Solution191 {
    public static void main(String[] args) {
        Solution191 solution191 = new Solution191();
        int n = 11;
        System.out.println(solution191.hammingWeight(n));
    }

    /**
     * 用Integer.bitCount函数统计参数n转成2进制后有多少个1
     *
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }

    /**
     * 如果一个整数不为0，那么这个整数至少有一位是1。
     * 如果我们把这个整数减1，那么原来处在整数最右边的1就会变为0，原来在1后面的所有的0都会变成1(如果最右边的1后面还有0的话)。
     * 其余所有位将不会受到影响。
     *
     * @param n
     * @return
     */
    public int hammingWeight_2(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }

    /**
     * 用flag来与n的每位做位于运算，来判断1的个数
     *
     * @param n
     * @return
     */
    public int hammingWeight_3(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((flag & n) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }
}
