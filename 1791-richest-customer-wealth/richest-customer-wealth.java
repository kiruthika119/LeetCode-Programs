class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxcnt=0;
        for(int i=0;i<accounts.length;i++)
        {
            int temp=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                temp += accounts[i][j];
            }
            maxcnt = Math.max(maxcnt,temp);
        }
        return maxcnt;
    }
}