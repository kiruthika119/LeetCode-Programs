class Solution {
public:
    int maximumPossibleSize(vector<int>& nums) {
        int s=0,pre=-1;
        for(auto num : nums)
        {
            if(num >= pre)
            {
                pre = num;
                s++;
            }
        }
        return s;
    }
};