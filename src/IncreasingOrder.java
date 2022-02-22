public class IncreasingOrder {
        public static void print(int n){
            if(n>0){
               print(n-1);
                System.out.println(n);
            }
            return;
        }
        public static void main(String[] args) {
            print(5);

        }
}
