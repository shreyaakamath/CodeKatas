package easy;

public class ExcelSheetColumn171 {
    /*
  AB
      A i=1 val=1 total= 1*26^1 = 26
      B i=0 val =2 total = 26 + 2*26^0 = 28

  Time: O(n) Space: O(1)
  */
    public int titleToNumber(String s) {
        char[] arr = s.toCharArray();
        int total =0;
        int base=26;
        int i=arr.length-1;
        for(char ch: arr){
            int val = (ch-'A')+1;
            total+=val*Math.pow(base,i);
            i--;
        }
        return total;

    }
}
