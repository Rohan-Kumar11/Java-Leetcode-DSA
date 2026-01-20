package com.day4;
import java.util.Scanner;
public class evenNumber {
    static void main() {
        int[] arr={12,345,2,6,7896};
        int inc=0;
        for(int i=0; i<arr.length ;i++){
            int n=arr[i];
            if(n<0){
                n*=-1;
            }
            int count=0;
            while(n>0){
                n/=10;
                count++;

            }
            if(count%2==0){
                inc++;
            }

            }
        System.out.println(inc);
        }
}
