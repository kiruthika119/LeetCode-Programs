class Solution {
    public int balancedStringSplit(String s) {
        int cntR=0,cntL=0,cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == 'R')
            {
                cntR++;
            }
            else
            {
                cntL++;
            }
            if(cntR == cntL)
            {
                cnt++;
            }
        }
        return cnt;
    }
}