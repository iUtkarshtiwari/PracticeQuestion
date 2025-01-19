
import java.util.Arrays;


// import java.util.Arrays;

// public class SelectionSort {
    

//         public static void Selection(int[] arr){
//                 for (int i = 0; i < arr.length-1; i++) {
    //                         int min=i;
    //                     for (int j = i+1; j < arr.length; j++) {
//                         if (arr[j] < arr[min]) { // Find the smallest element
//                             min = j;
//                         }                
//                     }
//                 int temp=arr[i];
//                 arr[i]=arr[min];
//                 arr[min]=temp;
//     }
// }
    
//         public static void main(String[] args) {
    //             int[] array = {5, 2, 8, 1, 9};
    //             Selection(array);
    //             System.out.println(Arrays.toString(array));
    
    //         }
    
    
    // }
    
    public class SelectionSort {

            public static void Selection(int[] arr){
                    for(int i=0;i<arr.length;i++){
                        int min=i;
                        for(int j=i+1;j<arr.length;j++){
                                if(arr[j]<arr[min]){         ////Agar min se bhi chota koi element mil raha hai tuo usko ek corner karenge right side and then swap karenge
                                    min=j;
                                }

                        }
                                    int temp=arr[i];
                                    arr[i]=arr[min];
                                    arr[min]=temp;  
                    }

                    }
            

                public static void main(String[] args) {
                        int[] arr = {5, 2, 8, 1, 9};
                        Selection(arr);
                        System.out.println(Arrays.toString(arr));
                    
                            }
            
    
    }