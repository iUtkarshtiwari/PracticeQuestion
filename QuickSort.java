import java.util.Arrays;

public class QuickSort {

    public static int sortingalgo(int[] arr,int low,int high){
            int pivot=arr[high];
          int i=low-1;
          for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);   // this condition comes when the i and j both are on same place so swapping the number of i and j will be the same like arr[i=1]=2,arr[j=1]=2 and both are less than 4 so i will be incremented by 1 and swapping will be done
            }
          }
          swap(arr,i+1,high);
          return i+1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void Quick(int[] arr,int l,int h){
        if(l<h)
        {
            int p=sortingalgo(arr,l,h);
            
            Quick(arr,l,p-1);
            Quick(arr,p+1,h);

        }
            
    }


    // static int sortingalgo(int[] arr, int low, int high) {
      
    //     int pivot = low;
    //     System.out.println(pivot);
    //     int i = low;
    //     int j = high;
        
    //     while(i<j){
    //         while(arr[i] <= arr[pivot] && i<=high-1){
    //             i++;
    //         }
            
    //         while(arr[j] > arr[pivot] && j>= low+1){
    //             j--;
    //         }
            
    //         if(i<j){
    //             swap(arr,i,j);
    //         }
    //     }
    //     swap(arr,j,pivot);
    //     return j;
        
        
    // }
// static int count=0;

//  static int sortingalgo(int[] arr, int low, int high) {
//     int rnd=(int)Math.random()%(high-low+1)+low;
//     swap(arr,rnd,low);
//     int i=low+1;
//     for(int j=i;j<=high;j++){
//         if(arr[low]>arr[j]){
//             swap(arr,i++,j);
//         }
//     }
//     swap(arr,low,i-1);
//     return i-1;
// }

// static void Quick(int[] arr, int low, int high) {
//             if(low<high){
//             int p = sortingalgo(arr,low,high);
//             Quick(arr,low,p-1);
//             Quick(arr,p+1,high);
//         }
//     }

        public static void main(String[] args) {
            int[] array = {3,2,5,0,1,8,7,6,9,4};
            System.out.println("Original array:");
            System.out.println(Arrays.toString(array));
            Quick(array,0,array.length-1);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    
        }
}
