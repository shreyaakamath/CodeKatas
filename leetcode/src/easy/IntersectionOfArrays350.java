package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArrays350 {
    /*
  What if the given array is already sorted? How would you optimize your algorithm?
  two pointer approach with sorted arrays for o(n) solution

  What if nums1's size is small compared to nums2's size? Which algorithm is better?
  Put nums1's elements into a map value -> count. intereate over nums2 and create a list

  What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
  If using sorted solution then go for merge sort since in memory sort not possible.
  Else put smaller array into hashmap
  */
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList();

        int i=0;int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }

        int[] arr = new int[list.size()];
        i=0;
        for(int n : list){
            arr[i]=n;i++;
        }

        return arr;
    }
}
