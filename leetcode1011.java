class leetcode1011{
    
        public static boolean magicFn(int[] arr, int days, int mid){
            int curDay = 1;
            int curSum = 0;
            for(int i: arr){
                    curSum += i;
                if(curSum > mid){
                    curDay++;
                    curSum = i;
                }
                if(curDay > days){
                    return false;
                }
            }
            return true;
        }
        public static int shipWithinDays(int[] arr, int days) {
                int low = Integer.MIN_VALUE;
                int high = 0;
                for(int i: arr){
                high += i;
                low = Math.max(low, i);
                }
            int minWt = high;
            while(low <= high){
                int mid = (low + high) >> 1; 
                boolean possible = magicFn(arr, days, mid);
            if(possible){ // one of possible ans and still we try to get it better
                minWt = mid;
                high = mid - 1;
                }
            else{
                low = mid + 1;
               }
            }
            return minWt;
            }


    public static void main(String[] args){

        int arr[]={3,2,2,4,1,4};
        int days = 3;
        System.out.println(shipWithinDays(arr, days)); // 6
    }
}


// Time Complexity: 𝑂(𝑛⋅log⁡(high−low))
// Space Complexity: 𝑂(1)