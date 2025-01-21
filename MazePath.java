
import java.util.Scanner;

public class MazePath {

    public static int maze(int row, int col, int m, int n){
        if(row==m || col==n) return 1;
        if(row>m || col>n) return 0;
        int rightWays=maze(row, col+1, m, n);
        int leftways=maze(row+1, col, m, n);   
        return rightWays+leftways; 
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n : ");
        int n=sc.nextInt();
        System.out.println("enter m : ");
        int m=sc.nextInt();
        System.out.println(maze(1,1,m,n));
    }
}
