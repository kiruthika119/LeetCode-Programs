class Solution {
public:
    long long interchangeableRectangles(vector<vector<int>>& r) {
        int n = r.size();
        unordered_map<double,int> mp;
        for(int i = 0;i<n;i++){
            double ratio = r[i][0]/(double)r[i][1];
            mp[ratio]++;
        }
        long long count = 0;
                
        for(auto i: mp){
            long long x = i.second;
            x = (x * (x-1))/2.0;
            count += x;
        }
        return count;
    }
};