class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i=0;i<k;i++){
            sum = sum + nums[i];
        }
        double max1 = sum; //assign sum to old sum called max
        for(int i=k;i<nums.length;i++){
            sum = sum + nums[i]-nums[i-k]; //This sum is sum of previously calculated sum + nums[next i] - nums[first i]. Hence the window moves one element at a time from left to right, adding one element on the right and subtracting one element on the left. 
                max1 = Math.max(max1,sum); //returns bigger of new sliding sum or old sum
        }
        return max1/4;
    }
}
