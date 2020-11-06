import java.util.Arrays;

/**
 * leetcode- 121
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction
 * (i.e., buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 * Note that you cannot sell a stock before you buy one.
 *
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *              Not 7-1 = 6, as selling price needs to be larger than buying price.
 10.10
 */
public class BuySellStock_121_1Trxn {

    public static int  maxProfit(int[] prices) {
        /*if(prices.length==2)
            return (Math.max(prices[0],prices[1]) - Math.min(prices[0],prices[1]));*/
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++) {
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }else
                maxProfit = Math.max(maxProfit,prices[i]-minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
//        int[] prices = {7,6,4,3,1};
        int[] prices = {1,2};
        System.out.println(Arrays.toString(prices)+" maxProfit:: "+maxProfit(prices));
    }
}
