##java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i]+nums[j]==target){
                    //return 2 items using a list
                    return new int[] {i, j};
                }
            }
        }
    throw new IllegalArgumentException("None"); 
    }
}