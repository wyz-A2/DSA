package wyz.leetcode.easy;

/**
 * @author
 * @date 2022/8/18
 * @description 509.斐波那契数
 * <p>
 * 难度：简单
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/fibonacci-number/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class E509丨斐波那契数 {

    public static void main(String[] args) {
        System.out.println(fib_iterator(7));
    }

    /**
     * 递归
     * 时间复杂度：O(2^n)
     * 空间复杂度：O(1)
     *
     * @param n
     * @return
     */
    private static long fib_recursion(int n) {
        if (n < 2) {
            return n;
        }
        return fib_recursion(n - 1) + fib_recursion(n - 2);
    }

    /**
     * 递归 + 缓存
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     * <p>
     * 经典的空间换时间
     *
     * @param n
     * @return
     */
    private static long fib_recursion_memory(int n) {
        long[] memory = new long[n + 1];
        return fib_recursion_memory(n, memory);
    }

    private static long fib_recursion_memory(int n, long[] memory) {
        if (n < 2) {
            return n;
        }
        if (memory[n] != 0) {
            return memory[n];
        }
        memory[n] = fib_recursion_memory(n - 1, memory) + fib_recursion_memory(n - 2, memory);
        return memory[n];
    }

    /**
     * 迭代
     * 时间复杂度：O(n)
     * 时间复杂度：0(1)
     * @param n
     * @return
     */
    private static long fib_iterator(int n) {
        if (n < 2) {
            return n;
        }
        long zero = 0;
        long first = 1;
        long result = zero + first;
        for (int index = 3; index <= n; index++) {
            zero = first;
            first = result;
            result = zero + first;
        }
        return result;
    }
}
