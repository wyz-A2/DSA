package wyz.leetcode.easy;

/**
 * @author
 * @date 2022/8/18
 * @description 231.2的幂
 * <p>
 * 难度：简单
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/power-of-two/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class E231丨2的幂 {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo_recursion(7));
    }

    /**
     * 递归求解
     * 时间复杂度：O(logn)
     *
     * @param n
     * @return
     */
    private static boolean isPowerOfTwo_recursion(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0 || n == 0) {
            return false;
        }
        return isPowerOfTwo_recursion(n / 2);
    }

    /**
     * 位运算
     * 时间复杂度：O(1)
     *
     * @param n
     * @return
     */
    private static boolean isPowerOfTwo_bitOperation(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

}
