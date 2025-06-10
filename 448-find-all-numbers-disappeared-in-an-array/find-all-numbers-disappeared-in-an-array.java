class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> res=new ArrayList<>();
       int n=nums.length;
       int[] k=new int[n+1];
       for(int i=0;i<n;i++)
       {
          k[nums[i]]++;
       } 
       for(int i=1;i<=n;i++)
       {
          if(k[i]==0)
          {
            res.add(i);
          }
       }
       return res;
    }
}