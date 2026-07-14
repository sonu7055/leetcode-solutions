class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> v;
        map<int,int> mpp;
        int n = nums.size();
        for(int i=0;i<n;i++){

            int k = target- nums[i];
            if(mpp.find(k) != mpp.end()){
                return {mpp[k],i};
            }
            mpp[nums[i]]=i;

        }
        return {};
        
    }
};