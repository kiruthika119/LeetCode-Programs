class Solution {
public:
    string truncateSentence(string s, int k) {
        int count =0;
        string res = "";
        for(char i : s)
        {
            if(i == ' ')
            {
                count++;
                if(count == k)
                  break;
            }
            res = res+i;
        }
        return res;
    }
};