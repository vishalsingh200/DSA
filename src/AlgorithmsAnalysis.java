public class AlgorithmsAnalysis {
    int fun1(int n){
        return n*(n+1)/2;
    }
    int fun2(int n){
        int sum = 0;
        for(int i = 0; i<n; i++)
            sum = sum + i;
        return sum;
    }
    int fun3(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                sum++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
       AlgorithmsAnalysis obj = new AlgorithmsAnalysis();
       obj.fun1(3);
       obj.fun2(3);
       obj.fun3(3);

    }
}
