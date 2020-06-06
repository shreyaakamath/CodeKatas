package week2;

public class Fibonacci {

    // Time: o(n) Space: o(1)
    public static long getNthFibonacci(int n){
        if(n==1) return 0;
        long first =0;
        long second =1;
        int i=2;
        while(i!=n){
            long third = first+second;
            first = second;
            second = third;
            i++;
        }
        return second;
    }

    public static int getLAstDigitOfNthFibonacci(int n){
        if(n==1) return 0;
        int first =0;
        int second =1;
        int i=2;
        while(i!=n){
            int third = (first+second)%10;//just store the last digit
            first = second;
            second = third;
            i++;
        }
        return second;
    }

    public static void main(String[] args){
       System.out.println(getLAstDigitOfNthFibonacci(327306));
    }
}
