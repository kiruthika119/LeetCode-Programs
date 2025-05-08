class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
      int deck=n*n;
      int res=0;
      for(int i=deck;i>=0;i--)
      {
        if(deck*w <= maxWeight)
        {
            res=deck;
            break;
        }
        else
        {
            deck--;
        }
      }  
      return res;
    }
}