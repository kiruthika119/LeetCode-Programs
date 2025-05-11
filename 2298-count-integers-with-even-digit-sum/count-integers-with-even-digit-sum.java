class Solution {
    private boolean checkSum(int num){
        int s=0;
        while(num>0)
        {
            s += num % 10;
            num/=10;
        }
        return s % 2 == 0;
    }
    public int countEven(int num) {
        int count=0;
        for(int i=2;i<=num;i++)
        {
            if(checkSum(i))
            {
                count++;
            }
        }
        return count;
    }    
}