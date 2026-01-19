public class ArmStrong {
        static void main(String[] args) {
            System.out.println("the three digit armstrong number are:");
            int i;
            for(i=100 ; i<1000; i++) {
                num(i);
            }
        }

    static void num(int n){
        int sum=0;
        int num=n;
        while(n>0) {
            int rem = n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(num==sum){
            System.out.println(num);
        }
    }
}
