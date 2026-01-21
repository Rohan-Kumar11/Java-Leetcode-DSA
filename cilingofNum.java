import java.util.Scanner;

public class cilingOfNum {
    static void main(String[] args) {
        int[] arr= new int[50];
        Scanner in= new Scanner(System.in);
        System.out.print("enter the length of array:");
        int n= in.nextInt();
        for (int i = 0; i < n ; i++) {
            arr[i]= in.nextInt();
        }
        System.out.print("enter the target:");
        int target = in.nextInt();

        int low=0;
        int high=n-1;
        int mid=(high+low)/2;
        while(low<=high){
            if(arr[mid]==target){
                System.out.print(arr[mid]);
                return;
            } else if(target < arr[mid]) {
                high=mid-1;
                mid=(high+low)/2;
            }
            else{
                low=mid+1;
                mid=(high+low)/2;
            }
        }
        System.out.print(arr[low]);
    }
}
