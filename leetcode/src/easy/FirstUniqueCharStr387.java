package easy;

public class FirstUniqueCharStr387 {

    /*
    Time: O(n)
    Space: O(1)
    */
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        char[] toCh = s.toCharArray();

        int index = -1;

        for(char ch: toCh){
            int i=(ch-'a');
            arr[i]+=1;
        }

        for(int i=0;i<toCh.length;i++) {
            char ch = toCh[i];
            if(arr[ch-'a']==1){index=i;break;}
        }

        return index;

    }
}
