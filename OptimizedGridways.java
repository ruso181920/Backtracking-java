public class OptimizedGridways {
    public static int factorial(int n) {
        if(n==0) {
            return 1;
        }
        return n*factorial(n-1);
    }
     public static void main(String[] args) {
        int rows=4,cols=4;
       int ways=factorial((rows-1)+(cols-1))/(factorial(cols-1)*factorial(rows-1));
        System.out.println("No of ways:"+ways);
    }
}
