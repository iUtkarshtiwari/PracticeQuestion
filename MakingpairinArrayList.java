import java.util.*;
import java.util.stream.Collectors;
class MakingpairinArrayList{
    public static void main(String[] args) {
        // Sample input arrays
        int[] efficiency = {5, 3, 8};
        int[] speed = {10, 7, 2};

        // Call the function and get the list
        List<int[]> helper = createHelperList(efficiency, speed);

        // Print the list elements
        for (int[] pair : helper) {
            System.out.println("Efficiency: " + pair[0] + ", Speed: " + pair[1]);
        }
    }

    public static List<int[]> createHelperList(int[] efficiency, int[] speed) {
        // Create the list
        List<int[]> helper = new ArrayList<>();

        // Populate the list with pairs of efficiency and speed
        for (int i = 0; i < efficiency.length; i++) {
            helper.add(new int[]{efficiency[i], speed[i]});
        }

        return helper; // Return the list
    }
}