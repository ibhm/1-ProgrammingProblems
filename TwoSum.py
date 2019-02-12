class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        
        for i in range(len(nums)-1,0,-1):
            if(nums[i]-target) in nums[:1]:
                return(nums.index(nums[i]-target),i)

##java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                int check = nums[i]-target;
                if (nums[j]==check) {
                    return new int[] {i, j};
                }
            }
        
        }  
        throw new IllegalArgumentException("None found");
    }
}