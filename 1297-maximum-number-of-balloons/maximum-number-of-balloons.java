class Solution {
    public int maxNumberOfBalloons(String text) {
        char[] ch=text.toCharArray();
        double[] ans=new double[5];
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i] == 'b')
            {
                ans[0] = ans[0]+1;
            }
            else if(ch[i] == 'a')
            {
                ans[1] = ans[1]+1;
            }
            else if(ch[i] == 'l')
            {
                ans[2] = ans[2]+.5;
            }
            else if(ch[i] == 'o')
            {
                ans[3] = ans[3]+.5;
            }
            else if(ch[i] == 'n')
            {
                ans[4] = ans[4]+1;
            }
        }
        Arrays.sort(ans);
        return (int)ans[0];
    }
}