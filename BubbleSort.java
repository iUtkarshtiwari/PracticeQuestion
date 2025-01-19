
// public class BubbleSort {

//     public static void bubbleSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {64,34,90,25,22,12,11};
//         bubbleSort(arr);
//         System.out.println("Sorted array: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//             }
//     }
// }

// *************************************************************************************************************
// import java.util.ArrayList;
// import java.util.Collections;
// public class BubbleSort {

//     public static void bubble(ArrayList<Integer> ans,int n){
        
//             for (int i = 0; i < ans.size(); i++) {
//                     for (int j = 0; j < ans.size()-i-1; j++) {
//                         if(ans.get(j)>ans.get(j+1)){
//                             Collections.swap(ans, j, j+1);
//                         }
//                 }
//             }   
//     } 

//     public static void main(String[] args) {
//         ArrayList<Integer> ans=new ArrayList<>();
//         int [] arr={64,34,25,12,22,11,90};
//             for (int i = 0; i < arr.length; i++) {
//                 ans.add(arr[i]);   
//             }
//         int n=ans.size();
//         bubble(ans,n);
//         System.out.println(ans);
//         // for (int i = 0; i < n; i++) {
//         //     System.out.print(arr[i]+",");
//         // }
//     }
//     }

//     // Time Complexity: O(n^2)
//     // Space Complexity:O(1)