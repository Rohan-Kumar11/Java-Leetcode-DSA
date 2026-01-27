package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Kid_Greatest_Candies {
//     LeetCode: 1431. Kids With the Greatest Number of Candies

    /*
    There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.



Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = input.nextInt();

        int[] candies = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            candies[i] = input.nextInt();
        }

        System.out.println("Enter extra candies:");
        int extraCandies = input.nextInt();

        List<Boolean> ans = kidsWithCandies(candies, extraCandies);
        System.out.println(ans);
    }

    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        /* Boolean[] result = new Boolean[candies.length];
        int[] arr = new int[candies.length];
        for(int i=0 ; i<candies.length ; i++){
            int inc=0;
            arr[i] = candies[i];
            arr[i]= arr[i] + extraCandies;
             for(int j=0 ; j<candies.length ; j++){
                if(arr[i]>=candies[j]){
                    inc++;
                }
            }
            if(inc==candies.length){
                result[i]=true;
            }
            else{
                result[i]=false;
            }
        }
        return Arrays.asList(result);*/
        Boolean[] result = new Boolean[candies.length];
        int max=0;
        for(int i=0 ; i<candies.length ; i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0 ; i<candies.length ; i++){
            if(candies[i]+extraCandies>=max){
                result[i]=true;
            }
            else{
                result[i]=false;
            }
        }
        return Arrays.asList(result);
    }

}
