package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle118 {
    /*
Time: O(n2).
Space: O(n2)

What should we look for? number of times we add to inner list.
    Outer loop iterates i->n times.
        Inner loop iterates upto 0->i.
        first time: 1 update
        next: 2 update
        next: 3 update
        ...

        1+2+3 ... n = n(n+1)/2 = O(n2) Gauss formula

*/
    public List<List<Integer>> generate(int numRows) {
        //base case numRows =1
        List<Integer> one = new ArrayList();one.add(1);
        List<List<Integer>> pascal = new ArrayList();
        if(numRows==0) return pascal;
        pascal.add(one);
        if(numRows==1) return pascal;

        for(int i=1;i<numRows;i++){
            //get previous
            List<Integer> previous = pascal.get(i-1);

            //fill in i values into current
            List<Integer> current = new ArrayList();
            for(int j=0;j<=i;j++) {
                //use 0 as default if previous under/over flows
                int first = 0;
                int second = 0;
                if(j-1>=0 && j-1<previous.size()) first = previous.get(j-1);
                if(j>=0 && j<previous.size()) second = previous.get(j);
                current.add(first+second);
            }

            pascal.add(current);

        }
        return pascal;
    }
}
