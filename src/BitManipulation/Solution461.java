package BitManipulation;

/**
 * 461. Hamming Distance（汉明距离）
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 */
public class Solution461 {
    public static void main(String[] args) {
        Solution461 solution461 = new Solution461();
        int x = 1, y = 4;
        System.out.println(solution461.hammingDistance(x, y));
    }

    /**
     * 对两个数进行异或操作，位级表示不同的那一位为 1，统计有多少个 1 。
     *
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int cnt = 0;
        while (z != 0) {
            if ((z & 1) == 1) {
                cnt++;
            }
            z = z >> 1;
        }
        return cnt;
    }

    /**
     * 使用 Integer.bitcount() 来统计 1 个的个数。
     *
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance_2(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    /**
     * 如果一个整数不为0，那么这个整数至少有一位是1。
     * 如果我们把这个整数减1，那么原来处在整数最右边的1就会变为0，原来在1后面的所有的0都会变成1(如果最右边的1后面还有0的话)。
     * 其余所有位将不会受到影响。
     *
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance_3(int x, int y) {
        int z = x ^ y;
        int cnt = 0;
        while (z != 0) {
            cnt++;
            z &= (z - 1);
        }
        return cnt;
    }
}
