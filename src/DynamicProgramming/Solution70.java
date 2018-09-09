package DynamicProgramming;

/**
 * 70. Climbing Stairs（爬楼梯）
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class Solution70 {
    public static void main(String[] args) {
        Solution70 solution70 = new Solution70();
        System.out.println(solution70.climbStairs(3));
    }

    /**
     * 直接用递归
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }

    /**
     * 用迭代的方法，用两个变量记录f(n-1) f(n-2)
     *
     * @param n
     * @return
     */
    public int climbStairs_2(int n) {
        int one = 1, two = 2, fN = 0;
        if (n <= 0) {
            return 0;
        } else if (n <= 2) {
            return n;
        } else {
            for (int i = 3; i <= n; i++) {
                fN = one + two;
                one = two;
                two = fN;
            }
            return fN;
        }
    }
}
