
import java.util.ArrayList;
import java.util.Stack;

class Leetcode739{

    public static ArrayList<Integer> dailyTemperatures(ArrayList<Integer> arr) {
            int n=arr.size();
            Stack<Integer> st=new Stack<>();
            ArrayList<Integer> res=new ArrayList<>(n);
            
            for (int i = 0; i < n; i++) {
                res.add(0); 
            }            

            for(int i=n-1;i>=0;i--){  //7  //6 //5
                    while(!st.isEmpty() && arr.get(i)>=arr.get(st.peek())){
                            st.pop();
                    }
                    if(!st.isEmpty()){
                            res.set(i,st.peek()-i); 
                    }
                    st.push(i);
            
            }
            return res;
    }

    public static void main(String[] args) {
        int[] tempa={73,74,75,71,69,72,76,73};
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<tempa.length;i++){
            arr.add(tempa[i]);
        }
        ArrayList<Integer> ans=dailyTemperatures(arr);
        System.out.println(ans);
    }
}