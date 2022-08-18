package wyz.leetcode.easy;

/**
 * @author
 * @date 2022/8/18
 * @description 70.爬楼梯
 * 难度：简单
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/climbing-stairs/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class E70丨爬楼梯 {

    public static void main(String[] args) {
        System.out.println(climbStairs_dp(3));
    }

    /**
     * 动态规划
     * 思路：每次爬1~2级台阶，爬到n层
     * 那么可能会先爬到n-1层后再爬一层，或者爬到n-2层后再爬两层
     * 设爬到n层的爬法为F(n)，那么我们可以轻易的得到
     * F(n) = F(n - 1) + F(n - 2)
     * 那么就很明显了，这就是斐波那契数列(从第2项开始)
     * 因此无论是递归，迭代（动态规划）还是矩阵快速幂都可以解决
     *
     * @param n
     * @return
     */
    public static int climbStairs_dp(int n) {
        if (n < 3) {
            return n;
        }
        int p = 1, q = 1, result = p + q;
        for (int i = 3; i <= n; i++) {
            p = q;
            q = result;
            result = p + q;
        }
        return result;
    }
}
