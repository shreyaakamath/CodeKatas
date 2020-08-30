package easy;

public class MissingNumber286 {
    /*
    Time: O(n)
    Space: O(1)
    */
    public int missingNumber(int[] nums) {
        int expected = 0;
        for(int i=1;i<=nums.length;i++) expected+=i;

        int actual=0;
        for(int n:nums) actual +=n;

        return expected-actual;

    }
}
