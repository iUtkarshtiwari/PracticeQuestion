
import java.util.ArrayList;
import java.util.Scanner;

public class Brackets {
        static ArrayList<String> arr=new ArrayList<>();
    public static void valid(int open,int close,String str,int n){
            if(str.length()==n){
                arr.add(str);
                return ;
            }
            valid(open+1,close,str+"(",n);
            valid(open,close+1,str+")",n);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  //3
        valid(0,0,"",n);
        System.out.println(arr);  
    }
}
