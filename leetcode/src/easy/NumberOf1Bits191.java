package easy;

public class NumberOf1Bits191 {
    // you need to treat n as an unsigned value
    // Time: O(n)
    public int hammingWeight(int n) {

        int sum=0;
        int mask=1;
        while(mask!=0) {
            if((n&mask) !=0)sum++;
            mask=mask<<1;
            //System.out.println(n+" -- "+sum);
        }
        return sum;

    }

}
