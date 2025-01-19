
import java.util.Scanner;

public class TernarySearch {

    public static int SearchinginArray(int[] arr,int target){
            int start=arr[0];
            int end=arr.length-1;
            while(start<=end){  
                int mid=(end-start)/3;  
                int i=start+(end-start)/3;     
                int j=end-(end-start)/3;
            if(arr[i]==target){
                return i;
            }
            if(arr[j]==target){
                return j;
            }
            if(target<arr[i]){
                end=i-1;
            }
            if(arr[j]<target){
                start=j+1;
            }
            else{
                i=start+1;
                j=end-1;
            }
        }
            return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int b=SearchinginArray(arr,k);
        System.out.println(b);
    }
}
//Time Complexity= O(log3N)
//Space Complexity=O(1)
//Why ternary Search is important?  

