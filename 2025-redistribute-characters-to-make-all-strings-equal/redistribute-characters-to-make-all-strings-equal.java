class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length==1)
        {
            return true;
        }
        int totcount=0;
        for(String s:words)
        {
            totcount = totcount+s.length();
        }
        if(totcount % words.length != 0)
        {
            return false;
        }
        int[] mymp=new int[30];
        for(String s:words)
        {
            for(char c : s.toCharArray())
            {
                mymp[c-'a']++;
            }
        }
        for(int i : mymp)
        {
            if(i % words.length != 0)
            {
                return false;
            }
        }
        return true;
    }
}