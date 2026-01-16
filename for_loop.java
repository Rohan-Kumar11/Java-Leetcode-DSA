import java.util.Scanner;
public class for_loop {
    static void main() {
        Scanner input = new Scanner(System.in);
        for(int i=1; i<20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
