package week2;

public class LastDigOfSumFibonacci {
    //Sum of Fib(0) + Fib(2) + ... + Fib(n) = Fib(n+3) - 1
    public static long getSum(int n){
        return (Fibonacci.getNthFibonacci(n+3)-1)%10;
    }

    public static void main(String[] args){
        System.out.println(getSum(100));
    }


}
