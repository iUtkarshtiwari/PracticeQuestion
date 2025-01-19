// #include <bits/stdc++.h>
// using namespace std;
// vector<int> workArr(1);
// vector<int> bucketArr(1);
// int noOfBucket;

// void update(int index, int newValue){
// int bNo = index / noOfBucket;
// int oldSum = bucketArr[bNo];
// int newSum = oldSum - workArr[index] + newValue;
// bucketArr[bNo] = newSum;
// }

// void preprocess(vector<int> originalArr){
// int n = originalArr.size();
// workArr.resize(n);
// noOfBucket = sqrt(n);
// bucketArr.resize(noOfBucket + 1); // think for edge case goodd job
// int bucketIndex = -1;

// for(int i = 0; i < n; i++){
// workArr[i] = originalArr[i];
// if(i % noOfBucket == 0){
// bucketIndex++;
// }
// bucketArr[bucketIndex] += workArr[i];
// }
// }

// int query(int left, int right){
// int sum = 0;
// while(left < right and (left % noOfBucket != 0) and left != 0){
// //work on left range
// sum += workArr[left++];
// }
// while(left + noOfBucket - 1 <= right){ // for full slots in between
// sum += bucketArr[left / noOfBucket];
// left += noOfBucket;
// }
// while(left <= right){ // work for last block/slot till the defined range mtlb sirf right tk jana
// sum += workArr[left++];
// }
// return sum;
// }



// int main() {
// int n; cin >> n;
// vector<int> arr(n);
// for(int &i: arr){
// cin >> i;
// }
// cout << query(0, 1) << endl;
// cout << query(2, 7) << endl;
// update(1, -10);
// cout << query(0, 2) << endl;
// update(4, 0);
// cout << query(0, 8) << endl;
// return 0;
// }

import java.util.*;

public class SquareRootDecomposition {
    static List<Integer> workArr = new ArrayList<>();
    static List<Integer> bucketArr = new ArrayList<>();
    static int noOfBucket;

    // Method to update an element at a given index with a new value
    public static void update(int index, int newValue) {
        int bucketNo = index / noOfBucket;
        int oldSum = bucketArr.get(bucketNo);
        int newSum = oldSum - workArr.get(index) + newValue;
        bucketArr.set(bucketNo, newSum);
        workArr.set(index, newValue); // Update the workArr with the new value
    }

    // Method to preprocess the original array
    public static void preprocess(List<Integer> originalArr) {
        int n = originalArr.size();
        workArr = new ArrayList<>(originalArr);
        noOfBucket = (int) Math.sqrt(n);
        bucketArr = new ArrayList<>(Collections.nCopies(noOfBucket + 1, 0)); // Initialize buckets with 0

        int bucketIndex = -1;

        for (int i = 0; i < n; i++) {
            if (i % noOfBucket == 0) {
                bucketIndex++;
            }
            bucketArr.set(bucketIndex, bucketArr.get(bucketIndex) + workArr.get(i));
        }
    }

    // Method to perform range sum query
    public static int query(int left, int right) {
        int sum = 0;

        // Add elements from the left range until the start of a full bucket
        while (left <= right && (left % noOfBucket != 0)) {
            sum += workArr.get(left++);
        }

        // Add sums of full buckets in between
        while (left + noOfBucket - 1 <= right) {
            sum += bucketArr.get(left / noOfBucket);
            left += noOfBucket;
        }

        // Add remaining elements from the right range
        while (left <= right) {
            sum += workArr.get(left++);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Input array elements
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        // Preprocess the array
        preprocess(arr);

        // Perform sample queries and updates
        System.out.println(query(0, 1)); // Query sum from index 0 to 1
        System.out.println(query(2, 7)); // Query sum from index 2 to 7
        update(1, -10); // Update index 1 with value -10
        System.out.println(query(0, 2)); // Query sum from index 0 to 2
        update(4, 0); // Update index 4 with value 0
        System.out.println(query(0, 8)); // Query sum from index 0 to 8

        sc.close();
    }
}
