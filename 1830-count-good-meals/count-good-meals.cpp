class Solution {
public:
    int countPairs(vector<int>& deliciousness) {
        int size=deliciousness.size(),count=0,mod=1e9+7,x=1;
        unordered_map<int,int> mp;
        vector<int> vec(1,1);
        for(int i=0;i<21;i++){
            x*=2;
            vec.push_back(x);
        }
        for(auto it:deliciousness){
            for(auto gt:vec){
                int x=gt-it;
                if(mp.find(x)!=mp.end())
                    count=count%mod+mp[x];
            }
            mp[it]++;
        }
        return count;
    }
};
