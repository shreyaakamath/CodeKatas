package easy;

import javax.swing.tree.TreeNode;

public class SymmetricTree101 {
    /*
  Time: O(n) Space: O(N)
  */
    public boolean isSymmetric(TreeNode root) {
        return helper(root, root);
    }

    public boolean helper(TreeNode node1, TreeNode node2){
        if(node1==null && node2==null) return true;
        if(node1==null ^ node2==null) return false;
        if(node1.val==node2.val &&
                helper(node1.left,node2.right)  &&
                helper(node1.right,node2.left))
            return true;

        return false;
    }
}
