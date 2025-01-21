import java.util.Scanner;

public class Allpossiblebinaryset {
    public static void possibleSet(String s,int n){
            int m=s.length();
            if(m==n){
                System.out.println(s);
                return;
            }
            if(m==0 || s.charAt(m-1)=='0'){
                possibleSet(")"+1, n);
            possibleSet("("+0, n);
            }
            else
            possibleSet(s+0, n);
    }
    
    
    
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            possibleSet("",n);
        }
}
