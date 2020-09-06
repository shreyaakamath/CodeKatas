package easy;

public class MaximumSubarray53 {
    /*
 Example:

 [-2,1,-3,4,-1,2,1,-5,4]

 i=    0   |1|2  |3
 max = -inf|-2|-1|-1
 sum=  -2  |-1|-4|

 Time: O(n) Space: O(1)
  */
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int n:nums){
            sum = Math.max(n, sum+n);//either continue the existing series or start a new one if n is greater than running sum
            max = Math.max(sum, max);//update max
            System.out.println(n+" -- "+sum +" -- "+max);
        }

        return Math.max(sum,max);

    }
}
