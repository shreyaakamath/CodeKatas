package easy;

public class BuySellStocks121 {
    /*
      Example:
      [3,2,5,7,1,4]
      min = 3|2|2||2|1|1|
      max = -|-|5||7|-|4|
      profit   |3||5|5|3|

      Time: O(n) Space: O(1)
      */
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int profit = 0;

        for(int n:prices){
            if(n<min) {min = n; max = Integer.MIN_VALUE;}
            if(n>max) {max =n; profit = Math.max(profit, max-min);}
        }

        return profit;
    }
}
