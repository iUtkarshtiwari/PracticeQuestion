// public class InsertionSort {
    
//     public static void insertionSort(int[] arr){
    //         for (int i = 1; i < arr.length; i++) {
        //             int key = arr[i];
        //             int j = i - 1;
        //             while (j >= 0 && arr[j] > key) {
            //                 arr[j + 1] = arr[j];
            //                 j--;
            //             }
            //             arr[j + 1] = key;
            //         }
            //     }
            
            //     public static void printArray(int[] arr) {
                //         for (int i = 0; i < arr.length; i++) {
                    //             System.out.print(arr[i] + " ");
                    //         }
                    //         System.out.println();
                    //     }
                    
                    //     public static void main(String[] args) {
                        //         int[] array = {5, 2, 8, 1, 9};
//         System.out.println("Original array:");
//         printArray(array);
//         insertionSort(array);
//         System.out.println("Sorted array:");
//         printArray(array);
//     }
// }

// Time Complexity: O(n^2)
// Space Complexity:O(1)

import java.util.Arrays;

public class InsertionSort {

        static void insertionSort(int[] arr){
            for (int i = 1; i < arr.length; i++) {
                 int j=i-1;
                 int k=arr[i];
                while(j>=0 && arr[j]>k){
                        arr[j+1]=arr[j];
                        System.out.println(arr[j+1]);
                        System.out.println(arr[j]);
                        j--;
                } 
                    arr[j+1]=k;

        } 
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9};
        System.out.println("Original array:");
        insertionSort(array);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }


}