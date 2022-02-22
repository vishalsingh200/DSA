public class FactorialUsingRecursion {
    public static int fact(int n){
        if (n==1){
            return 1;
        }
        int result = fact(n-1);
        int resultans = n* result;
        return  resultans;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fact(n));
    }
}
