import java.util.*;

class LeetCode1383 {
    public static int maxPerformance(int n, int[] spd, int[] eff, int k) {
        // Create a list of pairs to hold efficiency and speed
        List<int[]> helper = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            helper.add(new int[]{eff[i], spd[i]});
        }

        // Sort the list in descending order of efficiency
        helper.sort((a, b) -> b[0] - a[0]);

        // Priority queue to maintain the smallest speed
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 0, ans = 0;

        for (int[] it : helper) {
            int currentEff = it[0];
            int currentSpd = it[1];

            sum += currentSpd;
            pq.add(currentSpd);

            // If the queue size exceeds k, remove the smallest speed
            if (pq.size() > k) {
                sum -= pq.poll();
            }

            // Calculate current performance
            ans = Math.max(ans, sum * currentEff);
        }

        // Return the result modulo 10^9 + 7
        return (int) (ans % (int)(1e9 + 7));
    }

    public static void main(String[] args) {
        // Input values
        int n = 6; // Number of engineers
        int[] speed = {2,10,3,1,5,8};
        int[] efficiency = {5, 4, 3, 9, 7, 2};
        int k = 2; // Maximum team size

        // Create an instance of the Solution class
        // Call the maxPerformance function and print the result
        int result = maxPerformance(n, speed, efficiency, k);
        System.out.println("Maximum Performance: " + result);
    }

}
