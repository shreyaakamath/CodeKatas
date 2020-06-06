package week2;

public class GreatestCommonDivisor {

    // Time O(n) Space o(1)
    // "Efficient algorithm for GCD is an important basic primitive of cryptographic algorithms like RSA"
    public static int gcd(int a, int b){
        int larger = a>b?a:b;
        int smaller = a<b?a:b;
        int gcd = 1;
        for(int i=2;i<=larger/2;i++){
            if (i>smaller) break;
            if(a%i==0 && b%i==0) gcd = i;
        }
        return gcd;
    }
    public static void main(String[] args){
        System.out.println(gcd(1344,217));
    }
}
