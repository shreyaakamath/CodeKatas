package medium;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class verticalSum987 {

    /*
    Time: O(n)
    Space: O(n)
    */
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        map= new HashMap();
        helper(root, 0, 0);

        List<List<Integer>> ans = new ArrayList();
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet())  {
            ans.add(entry.getValue());
            int sum =0;
            for(int val:entry.getValue()) sum+=val;
            if(sum>max) max=sum;
        }
        System.out.println("max sum .. "+max);
        return ans;
    }

    public void helper(TreeNode root, int x, int y){

        if(root==null) return;
        System.out.println(root.val+"  ...  "+x+"  ..   "+map);


        //process the node
        if(map.containsKey(x)) {
            List<Integer> temp = map.get(x);
            temp.add(root.val);
        }
        else {
            List<Integer> temp = new ArrayList();
            temp.add(root.val);
            map.put(x, temp);
        }
        System.out.println(root.val+"  ...  "+x+"  ..   "+map);

        //process the children
        helper(root.left, x-1, y-1);
        helper(root.right, x+1, y-1);

    }
}
