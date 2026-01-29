public class GridWays {
    public static int gridWays(int i,int j,int n,int m) {
        //base case
        //a. condition for last cell
        if(i==n-1 && j==m-1) {
            return 1;
        }
         //b. condition for boundary cell
        if(i==n || j==m) {
            return 0;
        }
        int w1=gridWays(i+1, j, n, m);
        int w2=gridWays(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int rows=3,cols=3;
        System.out.println("No of ways to reach the last cell :"+gridWays(0,0,rows,cols));
    }
}
