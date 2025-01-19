public class The_Painters_Partition_Problem_ii{
    
        public static boolean magicFn(int[] arr,int noOfPainters,int mid){
            int noOfPaintersTaken=1;
            int time=0;
            for(int i:arr){
                time+=i;
                if(time>mid){
                    noOfPaintersTaken++;
                    time=i;
                }
                if(noOfPaintersTaken>noOfPainters){
                    return false;
                }
            }
            return true;
        }
        
        
        
        public static int minTime(int[] arr, int k) {
                int low=Integer.MIN_VALUE;
                int high=0;
                for(int i:arr){
                    low=Math.max(low,i);
                    high+=i;
                }
                int ans=high;
                while(low<=high){  // 30<=80
                    int mid=(high+low)/2;  //55
                    boolean possible=magicFn(arr,k,mid);      //no of painter pakdo aur unki speed k pakdo aur batao itna kaam kar paa raha hai ki nahi
                if(possible){
                    ans=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
                }
            return ans;
        }
        
        public static void main(String[] args) {
            int[] arr={5,10,30,20,15};
            int k=3;
            System.out.println(minTime(arr,k));
            
        }
    
    }
