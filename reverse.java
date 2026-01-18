import java.util.Scanner;

public class reverse {
   public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
       System.out.print("enter the no. :");
       int n= in.nextInt();
       int rem,rev=0;
       while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
           n/=10;
       }
       System.out.println("Reverse :"+ rev);
    }
}
