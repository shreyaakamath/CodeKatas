package easy;

import java.util.Arrays;

public class ContainsDuplicate217 {
    /*
Trade off between optimizing for space vs time.

if we want to optimize for time then use a hashset -> time o(n) space o(n)
if we want to optimize for space then qsort -> time o(nlogn) space o(1)

even if we are optimizing for time:
in general o(n) better than o(nlogn) but if n is sufficiently small then o(n) can become a slower approach because of the overhead of hash datastructure.

Time: O(nlogn)
Space: O(n) or O(1)
*/
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length && nums[i]==nums[i+1])return true;
        }
        return false;

    }
}
