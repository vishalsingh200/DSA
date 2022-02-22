import java.util.Scanner;
public class Factorial
{

        public static void main(String[] args){
        Scanner sc =new Scanner(System.in) ;
        int count = 0;
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        for (int i=5; n/i>=1; i*=5){
            count += n/i;
        }
            System.out.println(count);
    }

}
