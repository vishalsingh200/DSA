public class NumberOfDigit1 {
    public static int digit(int n){
        int count =0;
        while (n!=0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 156;
        System.out.println(digit(n));
    }

}
