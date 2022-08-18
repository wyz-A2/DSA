package wyz.leetcode.easy;

/**
 * @author
 * @date 2022/8/18
 * @description 121.买卖股票的最佳时机
 * 难度：简单
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class E121丨买卖股票的最佳时机 {

    public static void main(String[] args) {
        int[] prices = new int[]{7, 6, 5, 6, 3, 2, 2};
        System.out.println(maxProfit_loop(prices));
    }

    /**
     * 暴力法
     * 你用你的dp，我两个for走天下
     * 思路就很简单，不再赘述
     * <p>
     * 时间复杂度：O(n^2)
     *
     * @param prices
     * @return
     */
    private static int maxProfit_loop(int[] prices) {
        int maxProfit = 0, min, max;
        for (int i = 0; i < prices.length - 1; i++) {
            min = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                max = prices[j];
                maxProfit = Math.max(max - min, maxProfit);
            }
        }
        return maxProfit;
    }

    /**
     * 动态规划
     * 思路：
     * 1.最低价格购入
     * 2.之后的最高卖出
     * 即可实现最高盈利
     * <p>
     * 因为不需要记录买入卖出日期，因此整体思路很简单
     * <p>
     * 1.声明变量min，记录最低价格
     * 2.声明变量maxProfit，用来记录之后价格与min的最大价差
     * 3.遇到低于min的更新min值
     * 4.比较每天价格与min的价差， 大于maxProfit则更新maxProfit
     * <p>
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param prices
     * @return
     */
    private static int maxProfit_dp(int[] prices) {
        int min = prices[0], maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            maxProfit = Math.max(prices[i] - min, maxProfit);
        }
        return maxProfit;
    }
}
