class Solution {
public:
    bool checkRecord(string s) {
        int lc=0;
        int ac=0;
        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='A')
            {
                ac++;
                if(ac>=2)
                {
                    return false;
                }
            }
            if(s[i]=='L')
            {
                lc++;
                if(lc==3)
                {
                    return false;
                }
            } 
            else
            {
                lc=0;
            }
        }
        return true;
    }
};