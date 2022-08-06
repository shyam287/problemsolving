package easy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int left=0;
        int right = 1;
        while(right < prices.length) {

            int profit = prices[right] - prices[left];
            maxProfit = Math.max(maxProfit, profit);
            if (profit < 0) {
                left = right;
                right += 1;
            } else {
                right += 1;
            }
        }

        return maxProfit;
    }
}
