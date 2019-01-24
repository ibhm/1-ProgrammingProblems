class Solution {
public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for(int j = 1; j < nums.length;j++){
        if(nums[i] != nums[j]){
            i++;   //if first element and second element are not the same, we are ready to add this to array 
            nums[i] =nums[j]; //increment i to reach position of j, and add value of j. then incrememnt j by 1 in next iteration. This way j is ahead of i and j covers every value in the array and compares with the value of the array before it(i)
        } 
    }
    return i+1;//return i only because j is only declared as a variable for the loop
    }   
}