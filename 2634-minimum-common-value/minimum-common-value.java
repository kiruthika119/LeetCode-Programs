class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int s=0,k=0;
        while(s<nums1.length && k<nums2.length)
        {
            if(nums1[s]==nums2[k])
            {
                return nums1[s];
            }
            if(nums1[s]>nums2[k])
            {
                k++;
            }
            else
            {
                s++;
            }
        }
        return -1;
    }
}