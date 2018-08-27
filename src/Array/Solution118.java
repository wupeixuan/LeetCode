package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 118. Pascal's Triangle（杨辉三角）
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 */
public class Solution118 {
    public static void main(String[] args) {
        Solution118 solution118 = new Solution118();
        int numRows = 1;
        List<List<Integer>> res = solution118.generate(numRows);
        System.out.println(res);
    }

    /**
     * 对任意的n>0有
     * f(1, n)=1，(n>0)
     * f(1, 2)=1，(n=2)
     * f(i,j) = f(i-1, j-1)+f(i, j-1)，i>2,j>2
     *
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> sub = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    sub.add(1);
                } else {
                    List<Integer> upSub = res.get(i - 1);
                    sub.add(upSub.get(j - 1) + upSub.get(j));
                }
            }
            res.add(sub);
        }
        return res;
    }
}
