import java.util.Scanner;

public class count_letter {
    static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("enter the no. :");
        int n= in.nextInt();
        System.out.print("enter the no. :");
        int find=in.nextInt();
        int count=0;
        int a;
        while(n>0){
            a=n%10;
            if(a==find){
                count++;
            }
            n/=10;
        }
        System.out.print("the total no. is "+ count);

    }
}
