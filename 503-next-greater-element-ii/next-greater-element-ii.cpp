class Solution {
public:
    vector<int> nextGreaterElements(vector<int>& nums) {
        int n=nums.size();
        stack<int> s;
        vector<int> ans(n, -1);
        for(int i=2*n-1;i>=0;i--)
        {
            while(!s.empty() && s.top() <= nums[i%n])
            {
                s.pop();
            }
            if(i < n)
            {
                if(!s.empty())
                   ans[i] = s.top();
            }
                s.push(nums[i%n]);
        }
        return ans;
    }
};