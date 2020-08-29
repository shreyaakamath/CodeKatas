package easy;

import javax.swing.tree.TreeNode;

public class SortedArrayToBst108 {
    //time O(n) space O(n)
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    /*
    [1,2,3], 0, 2
        mid = 1
        Node(2)

            [1,2,3] 0, 0
            Node (1)

            [1,2,3] 2,2
            Node(2)

    */
    public TreeNode helper(int[] nums, int i, int j){
        if(i>j) return null;
        if(i==j) return new TreeNode(nums[i]);
        int mid = (i+j)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, i, mid-1);
        node.right = helper(nums, mid+1, j);
        return node;
    }
}
