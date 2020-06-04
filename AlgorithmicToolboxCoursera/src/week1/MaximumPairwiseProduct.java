package week1;

import Helper.InputHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Time : O(n)
Explain: iterate over all elements in the array only once.

Space: O(1)
Explain: creates constant number of variables
 */
public class MaximumPairwiseProduct {

    //TODO: add lombok, create allargsconstructor, move this to private member function
    public static int answer(List<Integer> arr){
        int first =0;
        int second =0;
        long product =1;

        for(int n: arr){
            if(n>first) {
                second = first;
                first =n;
            }else if(n>second){
                second = n;
            }
        }
        return Math.min(first*second, Integer.MAX_VALUE);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(answer(InputHelper.stringToIntList(scanner.nextLine())));
    }
}