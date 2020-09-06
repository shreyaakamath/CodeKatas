package leetcode.tree.easy;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber202 {
    /*
   Time: O(logn)

   Number n will have floor(log10n) digits .. log(n) digits. inner while loop.

   Next iteration, the inner while loop will have time complexity of log(logn). next time log(log(logn)) and so on. outer while loop.

   Adding the two the time complexity becomes log(n) + log(log(n)) + log(log(log(n))). Since log(n) is the larger term, we can conclude that the time complexity if log(n)

https://stackoverflow.com/questions/58977656/how-to-understand-time-complexity-of-happy-number-problem-solution-from-leetcode#:~:text=Time%20complexity%20%3A%20O(243%20*,number%20is%20given%20by%20logN.

   */
    public boolean isHappy(int n) {

        int sum = 0;
        List<Integer> list = new ArrayList();

        while(sum!=1)
        {
            sum=0;//reset at the start
            while(n!=0){
                int digit = n%10;
                sum+=digit*digit;
                n/=10;
            }
            System.out.println(n+" -- "+sum);
            if(sum==1) return true;
            else if(list.contains(sum)) return false;
            else {list.add(sum);n=sum;}
        }
        return false;
    }
}
