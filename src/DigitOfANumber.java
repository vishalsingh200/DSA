import java.util.Scanner;
public class DigitOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digt:");
        int n = sc.nextInt();
        int NoOfDigit = 0;
        int temp = n ;
        while (temp != 0) {
            temp = temp/10;
            NoOfDigit++;
        }
        int div =(int)Math.pow(10,NoOfDigit-1);
        while (div!=0) {
            int p =n/div;
            System.out.println(p);
            n=n%div;
            div=div/10;
        }
    }
}
