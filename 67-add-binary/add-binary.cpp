class Solution {
public:
    string addBinary(string a, string b) {
        string res;
        int k = a.length()-1;
        int s = b.length()-1;
        int c = 0;
        while(k >= 0 || s >= 0 || c)
        {
            if(k >= 0)
               c = c+a[k--] - '0';
            if(s >= 0)
               c = c+b[s--] - '0';
            res += c%2+'0';
            c = c/2;
        }
        reverse(begin(res), end(res));
        return res;
    }
};