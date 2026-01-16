import java.util.Scanner;

public class if_condition {
    static void main(String[]args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1= input.nextInt();
        System.out.print("Enter the second number: ");
        int num2= input.nextInt();
        if(num1 > num2 ){
            System.out.println("the greatest number is "+ num1);
        }
        if(num1 < num2 ){
            System.out.println("the greatest number is "+ num2);
        }
    }
}
