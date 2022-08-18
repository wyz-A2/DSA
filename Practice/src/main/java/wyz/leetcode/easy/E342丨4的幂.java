package wyz.leetcode.easy;

/**
 * @author
 * @date 2022/8/18
 * @description 342.4的幂
 * <p>
 * 难度：简单
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/power-of-four/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class E342丨4的幂 {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour_bitOperation(8));
    }

    /**
     * 递归求解
     * 时间复杂度：O(logn)
     *
     * @param n
     * @return
     */
    private static boolean isPowerOfFour_recursion(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 4 != 0 || n == 0) {
            return false;
        }
        return isPowerOfFour_recursion(n / 4);
    }

    /**
     * 位运算
     * 时间复杂度：O(1)
     * <p>
     * 4的幂的特点是奇数位为1，且有且一个1
     * <p>
     * 引入魔数：0x55555555
     * 二进制表示为：01010101 01010101 01010101 01010101
     *
     * @param n
     * @return
     */
    private static boolean isPowerOfFour_bitOperation(int n) {
        return (n > 0) && (n & (n - 1)) == 0 && (n & 0x55555555) == n;
    }
}
