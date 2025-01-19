import java.util.Arrays;

public class MergeSort {

    static void merge(int[]arr,int l,int mid,int h){
        int i=l;
        int j=mid+1;
        int[] temp=new int[h-l+1];
        int k=0;
        while(i<=mid && j<=h){
                if(arr[i]<arr[j]){
                    temp[k]=arr[i]; k++; i++;
                }
                else{
                    temp[k]=arr[j];  k++; j++;
                }
        }
        while(i<=mid) temp[k++]=arr[i++];
        while(j<=h)  temp[k++]=arr[j++];
        k=0;
        for(i=l;i<=h;i++){
            arr[i]=temp[k++];
        }
    }

        public static void Mergesort(int[] arr,int l,int h){
            if(l<h){
                int mid=l+((h-l)>>1);
                Mergesort(arr, l, mid);
                Mergesort(arr, mid+1, h);
                merge(arr,l,mid,h);
            }
        }

    public static void main(String[] args) {
           int[] arr = {5, 2, 8, 1, 9};
                        Mergesort(arr,0,arr.length-1);
                        System.out.println(Arrays.toString(arr));
    }
}
