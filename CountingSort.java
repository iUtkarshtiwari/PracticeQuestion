import java.util.Arrays;

public class CountingSort {
        static void Counting(int[]arr){
                int n=arr.length;
                int maxEle=Integer.MIN_VALUE;
                for(int i:arr){
                    maxEle=Math.max(maxEle,i);
                }
                int[]freq=new int[maxEle+1];
                Arrays.fill(freq,0);

            for(int i:arr){
                freq[i]++;
            }

            for(int i=1;i<freq.length;i++){
                    freq[i]+=freq[i-1];

            }
        int[] ans=new int[n];
            for(int i=n-1;i>=0;i--){
                ans[freq[arr[i]]-1]=arr[i];   //pls normalise by doing-1
                freq[arr[i]]--;
            }
            for(int i=0;i<n;i++){
                arr[i]=ans[i];
            }

        }


    public static void main(String[] args) {
                int[] arr = {5, 2, 8, 1, 9};
                        Counting(arr);
                        System.out.println(Arrays.toString(arr));
   
    }
}