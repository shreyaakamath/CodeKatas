package week2;

public class LeastCommonMultiple {

    // multiplicative values will overflow int so its critical to use long
    public static long lcm(int a, int b){
        int larger = a>b?a:b;
        long lcm=1;
        for(long i=larger;i<=(long)a*b;i++){
            //System.out.println("check-"+i);
            if(i%a==0 && i%b==0) {lcm = i;break;}
        }
        return lcm;
    }
    public static void main(String[] args){
        System.out.println(lcm(761457,614573));
    }
}
