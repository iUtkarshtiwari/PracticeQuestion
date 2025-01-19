import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class BucketSort {
    static ArrayList<Integer> workArr = new ArrayList<>();
    static ArrayList<Integer> bucketArr = new ArrayList<>();
    static int noOfBucket;
    static int bucketSize;

    // Query function to sum elements between `left` and `right` indices
    static int query(int left, int right) {
        int sum = 0;

        // Process the left partial block
        while (left <= right && (left % bucketSize != 0) && left < workArr.size()) {
            sum += workArr.get(left++);
        }

        // Process full blocks in between
        while (left + bucketSize - 1 <= right && left < workArr.size()) {
            sum += bucketArr.get(left / bucketSize);
            left += bucketSize;
        }

        // Process the right partial block
        while (left <= right && left < workArr.size()) {
            sum += workArr.get(left++);
        }

        return sum;
    }

    // Preprocess function to initialize workArr and bucketArr
    static void preprocess(ArrayList<Integer> originalArr) {
        int n = originalArr.size();
        workArr = new ArrayList<>(Collections.nCopies(n, 0));
        noOfBucket = (int) Math.sqrt(n); // Choose an appropriate number of buckets
        bucketSize = (n + noOfBucket - 1) / noOfBucket; // Calculate bucket size

        bucketArr = new ArrayList<>(Collections.nCopies(noOfBucket, 0));

        // Initialize workArr and bucketArr
        for (int i = 0; i < n; i++) {
            workArr.set(i, originalArr.get(i));
            int bucketIndex = i / bucketSize;  // Calculate bucket index
            bucketArr.set(bucketIndex, bucketArr.get(bucketIndex) + workArr.get(i));
        }
    }

    // Update function to change the value at `index` and update the bucket sum accordingly
    static void update(int index, int newValue) {
        int bNo = index / bucketSize;
        int oldSum = bucketArr.get(bNo);

        // Update the bucket sum by subtracting the old value and adding the new value
        int newSum = oldSum - workArr.get(index) + newValue;
        bucketArr.set(bNo, newSum);

        // Update the value in workArr
        workArr.set(index, newValue);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =5;
        ArrayList<Integer> arr = new ArrayList<>();
        int[] s={12,5,7,9,-18};
        // Reading the input array
        for (int i = 0; i < n; i++) {
            arr.add(s[i]);
        }

        // Preprocess the array for bucket sorting
        preprocess(arr);

        // Running some queries and updates
        System.out.print(query(0, 1)+" |");  // Query sum between indices 0 and 1
        System.out.print(query(2, 7)+" |");  // Query sum between indices 2 and 7
        update(1, -10);  // Update value at index 1 to -10
        System.out.print(query(0, 2)+" |");  // Query sum between indices 0 and 2
        update(4, 0);    // Update value at index 4 to 0
        System.out.print(query(0, 8)+" |");  // Query sum between indices 0 and 8
    }
}
