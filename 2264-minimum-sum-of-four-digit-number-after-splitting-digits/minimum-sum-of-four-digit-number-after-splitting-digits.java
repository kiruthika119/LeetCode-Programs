class Solution {
    public int minimumSum(int num) {
        int [] dig=new int[4];
        for(int i=0; num != 0;i++)
        {
            dig[i]=num%10;
            num/=10;
        }
        Arrays.sort(dig);
        return 10 * (dig[0] + dig[1]) + dig[2] + dig[3];
    }
}