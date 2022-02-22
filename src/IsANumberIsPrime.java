import java.util.Scanner;
public class IsANumberIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i =0; i<t; i++){
            int count =0;
            int n =sc.nextInt();
            for (int div=2; div*div<=n; div++){
               if (n%div==0){
                   count++;
                   break;
               }
            }
            if(count==0)
                System.out.println("prime");
            else
                System.out.println("not prime");
        }

    }
}
