package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Build_array_from_permutation {
    static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n= in.nextInt();

        int[] arr = new int[n];
        System.out.print("enter the elements in array:");
        for(int i=0; i<n ; i++){
            arr[i]=in.nextInt();
        }
        System.out.println("after the permutation:");
        int[] ans= buildArray(arr);
        System.out.println(Arrays.toString(ans));
    }
     static public int[] buildArray(int[] arr) {
        int[] ans= new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            ans[i]=arr[arr[i]];
        }
        return ans;
    }

}
