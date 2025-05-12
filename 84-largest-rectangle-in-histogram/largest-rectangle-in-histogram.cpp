class Solution {
public:
    int largestRectangleArea(vector<int>& h) {
        int ans=0;
        int n=h.size();
        vector<int> l(n);
        vector<int> r(n,n-1);
        stack<int> s;
        for(int i=0;i<n;i++)
        {
            while(!s.empty() && h[s.top()] >= h[i])
            {
                s.pop();
            }
            if(!s.empty())
              l[i] = s.top()+1;
            else
              l[i]=0;
         s.push(i);
        }
        while(!s.empty())
          s.pop();
        for(int i=n-1;i>=0;i--)
        {
            while(!s.empty() && h[s.top()] >= h[i])
            {
                s.pop();
            }
            if(!s.empty())
              r[i] = s.top()-1;
        s.push(i);
        }
        for(int i=0;i<n;i++)
        {
            ans=max(ans,h[i]*(r[i]-l[i]+1));
        }
        return ans;
    }
};