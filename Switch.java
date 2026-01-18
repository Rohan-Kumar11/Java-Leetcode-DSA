import java.util.Arrays;
import java.util.Scanner;
public class Switch {
    static void main(String[] args) {
        System.out.print("Enter the day: ");
        Scanner in=new Scanner(System.in);
        int day= in.nextInt();
//        switch (day){
//            case 1:
//                System.out.print("Monday");
//                break;
//            case 2:
//                System.out.print("tuesday");
//                break;
//            case 3:
//                System.out.print("wednesday");
//                break;
//            case 4:
//                System.out.print("thrusday");
//                break;
//            case 5:
//                System.out.print("friday");
//                break;
//            case 6:
//                System.out.print("saturday");
//                break;
//            case 7:
//                System.out.print("sunday");
//                break;
//            default:
//                System.out.print("not valid");
//        }
        switch (day) {
            case 1 -> System.out.print("Monday");
            case 2 -> System.out.print("tuesday");
            case 3 -> System.out.print("wednesday");
            case 4 -> System.out.print("thrusday");
            case 5 -> System.out.print("friday");
            case 6 -> System.out.print("saturday");
            case 7 -> System.out.print("sunday");
            default -> System.out.print("not valid");
        }
    }
}
