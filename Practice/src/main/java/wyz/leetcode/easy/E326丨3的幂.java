package wyz.leetcode.easy;

/**
 * @author
 * @date 2022/8/18
 * @description 326.3的幂
 * <p>
 * 难度：简单
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/power-of-three/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class E326丨3的幂 {

    public static void main(String[] args) {
        System.out.println(isPowerOfThree_recursion(7));
    }

    /**
     * 递归求解
     * 时间复杂度：O(logn)
     *
     * @param n
     * @return
     */
    private static boolean isPowerOfThree_recursion(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 3 != 0 || n == 3) {
            return false;
        }
        return isPowerOfThree_recursion(n / 3);
    }
}
