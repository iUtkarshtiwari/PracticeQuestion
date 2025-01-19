import java.util.Arrays;

public class RadixSort {

    static void Radix(int[]arr){
    int maxi=Integer.MIN_VALUE;
    for(int i:arr){
        maxi=Math.max(maxi, i);
    }
    for (int i = 1;(maxi/i)>0; i*=10) {
        CountingSort(arr, i);
    }
    }
    
    
    public static void CountingSort(int[] arr,int place){
        int n=arr.length;
        int[] freq=new int[n];
        Arrays.fill(freq,0);
        int[] ans=new int[n];
        for (int i = 0; i < n; i++) {
            freq[(arr[i]/place)%10]++;
        }

        for(int i=1;i<10;i++){
            freq[i]+=freq[i-1];
        }

        for(int i=n-1;i>=0;i--){
            ans[(freq[(arr[i]/place)%10])-1]=arr[i];
            freq[(arr[i]/place)%10]--;
        }

        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }

    public static void printarr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);   
        }
    }



    public static void main(String[] args) {
           int[] arr = {5, 2, 8, 1, 9};
            Radix(arr);
           printarr(arr);
   
    }
}
