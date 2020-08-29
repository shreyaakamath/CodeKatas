package easy;

public class MoveZeros283 {
    //time O(n) space o(1)
    public void moveZeroes(int[] a) {
        int start =0;
        int end =-1;
        int zero =0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0) {a[start] =a[i]; start++;}
            else {
                zero++;
                if(end==-1) end = start+1;
                else end++;
            }
        }
        //sub-optimal operations
        for(int i=a.length-zero;i<a.length;i++)a[i]=0;
    }
}
