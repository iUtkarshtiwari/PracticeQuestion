class leetcode875 {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1; // Minimum speed can be 1 (eating 1 banana per hour)
        int end = 0;   // Max speed is the size of the largest pile
        
        // Find the largest pile to set as the initial `end`
        for (int pile : piles) {
            end = Math.max(end, pile);
        }
        
        int ans = end; // Store the minimum speed found
        while (start <= end) {
            int mid = start + (end - start) / 2; // Avoid overflow
            if (isPossible(piles, mid, h)) {
                ans = mid;  // Update the answer to the current speed
                end = mid - 1; // Try to find a smaller speed
            } else {
                start = mid + 1; // Increase speed if the current one isn't sufficient
            }
        }
        return ans;
    }

    // Helper function to check if Koko can eat all bananas at the given speed within `h` hours
    private boolean isPossible(int[] piles, int speed, int h) {
        int totalHours = 0;
        for (int pile : piles) {
            // Calculate the time required to eat this pile at the current speed
            int p=pile;
            totalHours += (pile + speed - 1) / speed; // Same as Math.ceil((double)pile / speed)
            int th=totalHours;
            if (totalHours > h) {
                return false; // If total hours exceed `h`, this speed is not feasible
            }
        }
        return true; // If we can finish within `h` hours, this speed is feasible
    }

    // Main function to test the solution
    public static void main(String[] args) {
        leetcode875 solution = new leetcode875();

        // Test case 1
        int[] piles1 = {3, 6, 7, 11};
        int h1 = 8;
        System.out.println("Minimum eating speed for test case 1: " + solution.minEatingSpeed(piles1, h1));

        // Test case 2
        int[] piles2 = {30, 11, 23, 4, 20};
        int h2 = 5;
        System.out.println("Minimum eating speed for test case 2: " + solution.minEatingSpeed(piles2, h2));

        // Test case 3
        int[] piles3 = {30, 11, 23, 4, 20};
        int h3 = 6;
        System.out.println("Minimum eating speed for test case 3: " + solution.minEatingSpeed(piles3, h3));
    }
}
