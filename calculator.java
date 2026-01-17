import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("calculator:");
        float num1= in.nextFloat();;
            while(true) {
                char op = in.next().trim().charAt(0);
                    if(op=='+'){
                        float num2= in.nextFloat();
                        num1=num1+num2;
                    }
                    if(op=='-'){
                        float num2= in.nextFloat();
                        num1=num1-num2;
                    }
                    if(op=='/'){
                        float num2= in.nextFloat();
                        num1=num1/num2;
                    }
                    if(op=='*'){
                        float num2= in.nextFloat();
                        num1=num1*num2;
                    }
                    if(op=='='){
                        break;
                    }
                }

            System.out.println("cal="+ num1);


    }
}
