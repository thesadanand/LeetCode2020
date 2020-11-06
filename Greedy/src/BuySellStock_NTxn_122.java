import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 122. Best Time to Buy and Sell Stock II
 * you can do N transsactions
 * 1.55
 */

public class BuySellStock_NTxn_122 {

    public static int maxProfit(int[] prices) {
        List<Integer> profitList = new ArrayList<>();
        int maxProfit = 0;
        int i=0;
        int j = 1;
        int sp, bp = 0;
        while(i<prices.length-1){
            while(prices[i]<prices[j]){
                if(j<prices.length-1 && prices[j]<prices[j+1])
                    j++;
                else{
                    System.out.println("compute profit");
                    bp = prices[i];
                    sp = prices[j];
                    maxProfit += sp-bp;
                    break;
                }
            }
            i=j;
            j=i+1;
        }
        return maxProfit;
    }

    public static int maxProfitAltLeetCodeSoln(int[] prices) {
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]) {
                maxProfit += prices[i]-prices[i-1];
            }
        }
       return maxProfit;
    }

    public static void main(String[] args) {
        int[] input = { 7,1,5,3,6,4};
//        int[] input = {1,2,3,4,5};
//        int[] input = {7,6,4,3,1};
        int maxProfit = maxProfit(input);

        System.out.println("input:: "+ Arrays.toString(input)+"\t max-profit:: "+maxProfit);
        System.out.println("input:: "+ Arrays.toString(input)+"\t LeetCode-max-profit:: "+maxProfitAltLeetCodeSoln(input));
    }

}
