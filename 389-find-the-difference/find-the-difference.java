class Solution {
    public char findTheDifference(String s, String t) {
        int S=0;
        int T=0;
        for(char c : s.toCharArray())
        {
            S = S+c;
        }
        for(char c : t.toCharArray())
        {
            T= T+c;
        }
        return (char)(T-S);
    }
}