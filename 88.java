class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[n+m];
        nums3 = nums1.clone();
        int i= (m+n)-1;
        int j = m - 1;
        int k = n - 1;
        while(i>=0 && k>=0){
            if(nums3[j]>=nums2[k]){
                nums1[i] = nums3[j];
                j--;
                i--;
            }else{
                nums1[i]=nums2[k];
                k--;
                i--;
            }
        }
        return nums1;
    }
}