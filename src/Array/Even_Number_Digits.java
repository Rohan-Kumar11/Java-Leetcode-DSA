package Arrays;

import java.util.Scanner;

public class Even_Number_Digits {
//    Leet Code: 1295. Find Numbers with Even Number of Digits

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i< size; i++){
            nums[i] = input.nextInt();
        }
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    static public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(digits(num) % 2 == 0){
                count++;
            }

        }
        return count;
    }

    static public int digits(int num){
        int even=0;
        for(int i=0 ; i<nums.length ; i++){
            int n=nums[i];
            int count=0;
            while(n!=0){
                n=n/10;
                count++;
            }
            if(count%2==0){
                even++;
            }
        }
        return even;

    }
}
