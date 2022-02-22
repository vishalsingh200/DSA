
public class PowerOfTwoNo {
    public static int power(int x, int n){
        if (n!=0){
            return (x * power(x,n-1));
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        int x = 3;
        int n= 4;
        int res = power(x,n);
        System.out.println(res);
    }

}
