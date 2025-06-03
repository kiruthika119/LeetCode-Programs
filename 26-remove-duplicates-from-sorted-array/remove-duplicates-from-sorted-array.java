class Solution {
    public int removeDuplicates(int[] nums) {
      if(nums.length == 0)
      {
        return 0;
      }
      int a=1;
      for(int k =1;k<nums.length;k++)
      {
        if(nums[k] != nums[a-1])
        {
            nums[a] = nums[k];
            a++;
        }
      }
      return a;
    }
}