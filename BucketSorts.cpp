#include <bits/stdc++.h>
using namespace std;

vector<int> workArr(1);
ArrayList<Integer> arr=new
int noOfBucket;

void update(int index,int newValue){
      int bNo = index / noOfBucket;
    int oldSum = bucketArr[bNo];
    int newSum = oldSum - workArr[index] + newValue;
    bucketArr[bNo] = newSum;
}

void preprocess(vector<int> originalArr){
    int n = originalArr.size();
    workArr.resize(n);
    noOfBucket = sqrt(n);
    bucketArr.resize(noOfBucket + 1); // think for edge case goodd job
    int bucketIndex = -1;
   
    for(int i = 0; i < n; i++){
        workArr[i] = originalArr[i];
        if(i % noOfBucket == 0){
            bucketIndex++;
        }
        bucketArr[bucketIndex] += workArr[i];
    }

}

int query(int left,int right){
        int sum=0;
        while(left<right and (left%noOfBucket!=0 and left!=0)){  //work on left range
                sum+=workArr[left++];
        }
         while(left + noOfBucket - 1 <= right){ // for full slots in between
        sum += bucketArr[left / noOfBucket];
        left += noOfBucket;
    }
    while(left <= right){ // work for last block/slot till the defined range mtlb sirf right tk jana
        sum += workArr[left++];
    }
    return sum;
}




int main(){
        int n;
        vector<int> arr;
        cin>>n;
        for(int &i:arr){
                cin>>i;
        }
        cout<<query(0,1)<<endl;
        cout<<query(2,7)<<endl;
        update(1,-10);
        cout<<query(0,2)<<endl;
        update(4,0);
        cout<<query(0,8)<<endl;


    return 0;
}