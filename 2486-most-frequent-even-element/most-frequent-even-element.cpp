class Solution {
public:
    int mostFrequentEven(vector<int>& nums) {
        unordered_map<int, int> mp;
       int n = nums.size();
       for(int i=0;i<n;i++)
       {
         if(nums[i] % 2 == 0)
            ++mp[nums[i]];
       }
       int m = -1, mf = 0;
       for(const auto& [key , cnt] : mp)
       {
        if(cnt > mf)
        {
            m = key;
            mf = cnt;
        }
        else if(cnt == mf)
            m = min(m, key);
       }
    return m;
    }
};