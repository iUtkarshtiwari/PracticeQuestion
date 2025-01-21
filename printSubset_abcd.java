
// import java.util.ArrayList;

// public class printSubset {
//     static ArrayList<String> arr=new ArrayList<>();
//     public static void printSub(int i,String s,String ans){
//             if(i==s.length()){
//                 arr.add(ans);
//                 return;
//             }   
        
//         char ch=s.charAt(i);
//             printSub(i+1,s,ans+ch);  //take
//             printSub(i+1,s,ans);    //not tak
//     }


// public static void main(String[] args) {
//     String s="abcd";
//     printSub(0,s,"");
//     System.out.println(arr);
// }


// }




import java.util.ArrayList;

public class printSubset_abcd {
    
    static ArrayList<String> arr=new ArrayList<>();
    public static void printSub(int i,String s,String ans){
            if(i==s.length()){
                arr.add(ans);
                return;
            }   
        
            printSub(i+1,s,ans);    //not tak
            ans+=s.charAt(i);
            printSub(i+1,s,ans);  //take
    }


public static void main(String[] args) {
    String s="abcd";
    printSub(0,s,"");
    System.out.println(arr);
}


}

