class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int s = m-1;
       int k = n-1;
       int j = m+n-1;
       while(s >= 0 && k >= 0)
       {
        if(nums2[k] > nums1[s])
        {
            nums1[j] = nums2[k];
            k--;
        }
        else
        {
            nums1[j] = nums1[s];
            s--;
        }
        j--;
       }
       while( k >= 0)
       {
        nums1[j] = nums2[k];
        j--;
        k--;
       } 
    }
}