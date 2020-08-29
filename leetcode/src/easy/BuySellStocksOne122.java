package easy;

public class BuySellStocksOne122 {
    class Solution {
        public int maxProfit(int[] prices) {
            int profit=0;
            for(int i=0;i<prices.length;i++){
                if(i+1<prices.length && prices[i+1]>prices[i])profit += prices[i+1]-prices[i];
            }
            return profit;
        }

        /*
       Find the minimum transactions. solution is capable of keeping track of the buy and sell days.
       Will work incase there is a commision fee associated with each buy/sell.

       ref: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/discuss/208241/Explanation-for-the-dummy-like-me

       Example:

       [3, 2, 5] -> (2,5)
       [3,2,5,8] -> (2,8) -- 3,2 continuous decreasing. 5,8 continuous increasing
       [3,2,5,8,1,9] -> [(2,8),(1,9)] -- 3,2 continuous decreasing. 5,8 increasing. 1 .. 9.

       time O(n) space o(1)
       */
        public int maxProfitOptimalTrans(int[] prices) {
            int profit =0;int i=0;
            int n = prices.length-1;//since we reference i after the while loop we stop before the last position else in the case of only increasing/decreasing sequence there will be an out of index exception. the sell price and buy price will be same in this corner case hence profit = 0
            //List<Pair<Integer,Integer>> list = new ArrayList(); need to import Pair class

            while(i<n){
                // start from current position find the last **continuous** minimum price.
                while(i<n && prices[i+1] < prices[i])i++;
                int buyPrice = prices[i];
                int buyIndex =i;

                // start from current position, find the last **continuous** maximum price.
                while(i<n && prices[i+1] >= prices[i])i++;
                int sellPrice = prices[i];
                int sellIndex =i;

                profit += sellPrice - buyPrice;
                //list.add(new Pair(buyIndex, sellIndex));
            }

            return profit;

        }


    }
}
