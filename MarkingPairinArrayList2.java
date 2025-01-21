import java.util.ArrayList;
import java.util.List;

public class MarkingPairinArrayList2{
    public static void main(String[] args) {
        // Create a list to hold arrays of integers
        List<int[]> helper = new ArrayList<>();

        // Add arrays to the list
        helper.add(new int[]{5, 10}); // Add {5, 10} //paair0
        helper.add(new int[]{3, 7});  // Add {3, 7}
        helper.add(new int[]{8, 2});  // Add {8, 2}

        // Access and print the elements
        for (int[] pair : helper) {
            System.out.println("Efficiency: " + pair[0] + ", Speed: " + pair[1]);
        }
    }
}
