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

