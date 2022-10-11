class Solution {
public:
    bool increasingTriplet(vector<int>& nums) {
        int n=nums.size();
        vector<pair<int,int>>dp(n);
        int mn=nums[0];
        for(int i=1; i<n-1 ;i++){
            dp[i].first=mn;
            mn=min(mn,nums[i]);
        }
        mn=nums[n-1];
        for(int i=n-2; i>=1 ;i--){
            dp[i].second=mn;
            mn=max(mn,nums[i]);
        }
        for(int i=1; i<n-1 ; i++){
            if(nums[i]>dp[i].first&&nums[i]<dp[i].second){
                return true;
            }
        }
        return false;
    }
};