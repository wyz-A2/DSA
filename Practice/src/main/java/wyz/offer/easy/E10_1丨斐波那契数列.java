package wyz.offer.easy;

/**
 * @author
 * @date 2022/8/18
 * @description 剑指Offer 10-I 斐波那契数列
 * 难度：简单
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class E10_1丨斐波那契数列 {
    public static void main(String[] args) {
        System.out.println(fib(100));
    }

    /**
     * 迭代
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param n
     * @return
     */
    private static int fib(int n) {
        if (n < 2) {
            return 1;
        }
        int model = 1000000007;
        int p, q = 1, result = 1;
        for (int i = 3; i <= n; i++) {
            p = q;
            q = result;
            result = (p + q) % model;
        }
        return result;
    }
}
