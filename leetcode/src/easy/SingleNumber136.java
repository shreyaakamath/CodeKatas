package easy;

public class SingleNumber136 {

    //time: o(n) space: o(1)
    public int singleNumber(int[] nums) {
        int x = nums[0];
        for(int i=1;i<nums.length;i++) x ^= nums[i];
        return x;
    }
}
