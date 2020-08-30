package easy;

import java.util.HashMap;

public class RomanToInt13 {
    /*
  Example:
  XIV
      X current = 10 next = 1 total = 10
      I current =1 next = 5 total = 10 + 4 = 14

  Time: O(n)
  Space: O(1)
  */
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total =0;
        int i=0;
        while(i<s.length()){
            char ch = s.charAt(i);
            int current = map.get(ch);
            int next = Integer.MIN_VALUE;
            if(i+1<s.length()) next = map.get(s.charAt(i+1));
            if(current>=next) {total +=current;i++;}
            else {total += (next-current);i+=2;}
        }
        return total;

    }
}
