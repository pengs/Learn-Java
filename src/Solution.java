/*
给定一个整数数组和目标值，找出数组中和目标值的两个数
*/

public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        for(int i = 0;i < nums.length;i++)
        {
            for(int  j = i+1;j < nums.length;j++)
                if(nums[j] == target-nums[i])
                {
                    return new int[]{i,j};
                }
        }
        return new int[]{-1,-1};
    }
}