package week2;

import java.util.ArrayList;
import java.util.List;

public class FibonacciModulo {

    public static long getNthFibModulo(int n, int m){
        List<Long> sequence = getPeriod(m);
        System.out.println("sequence is "+sequence);
        int period = sequence.size();
        System.out.println("pisano period is "+period);
        int smallerEquivalent =  n%period;
        return sequence.get(smallerEquivalent);
    }

    // the sequence will always start with 01
    private static List<Long> getPeriod(int m){
        //start from F_1_mod_m, F_2_mod_m ... until you detect a sequence. return the length of the sequence.
        List<Long> list = new ArrayList();
        long first =0;
        long second =1;
        list.add(first%m);list.add(second%m);
        int i=0;
        do{
            //System.out.println("i - "+i+ "first- "+first%m + " second - "+second%m);
            long third = first+second;
            first = second;
            second = third;
            list.add(third%m);
        }while(!(first%m==0 && second%m==1));
        return list.subList(0,list.size()-2);
    }

    public static void main(String [] args){
        System.out.println(getNthFibModulo(2015,3));
    }
}
