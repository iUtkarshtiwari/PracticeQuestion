 #include <bits/stdc++.h>
 using namespace std;
 
    int KadMagic(vector<int>& arr){
        int ans = arr[0];
        int sum = 0;
        for(int i: arr){
            sum += i;
            ans = max(ans, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return ans;
    }
    int maxSubarraySumCircular(vector<int>& arr) {
        int firstOption = KadMagic(arr); // hold original array;
        int sum = 0;
        for(int& i: arr){
            sum += i;
            i *= -1;
        }
        // by now we have opposite signs
        int secondOption = KadMagic(arr);
        if(sum + secondOption == 0){
            return firstOption;
        }
        return max(firstOption, sum + secondOption);
    }

    int main(){
        vector<int> arr = {1,-2,3,-2};
        cout << maxSubarraySumCircular(arr) << endl;
        return 0;
    }
