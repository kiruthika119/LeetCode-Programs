class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if(matrix == null || matrix.length == 0)
        {
            return ans;
        }
        int row=matrix.length;
        int col=matrix[0].length;
        int l=0,r=col-1,t=0,b=row-1;
        while(l <= r && t <= b)
        {
            for(int i=l;i<=r;i++)
            {
                ans.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                ans.add(matrix[i][r]);
            }
            r--;
            if(t <= b)
            {
                for(int i=r;i>=l;i--)
                {
                    ans.add(matrix[b][i]);
                }
                b--;
            }
            if(l <= r)
            {    
                for(int i=b;i>=t;i--)
                {
                    ans.add(matrix[i][l]);
                }
                l++;
            }
        }
        return ans;
    }
}