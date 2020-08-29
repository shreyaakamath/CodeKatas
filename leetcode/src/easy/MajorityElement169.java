package easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    //time o(n) spcae o(n)
    public int majorityElement(int[] nums) {
        int times = nums.length/2;
        Map<Integer, Integer> map = new HashMap();
        int majority = nums[0];

        for(int n: nums){
            if(map.containsKey(n)) {
                int val = map.get(n);
                if(val+1>times) {majority = n; break;}
                map.put(n, val+1);
            } else {
                map.put(n,1);
            }
        }
        return majority;

    }
}
