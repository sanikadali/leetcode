1class Solution {
2    public int missingNumber(int[] nums) {
3        int sum=0;
4        for(int i=0;i<nums.length;i++){
5            sum=sum+nums[i];
6        }
7        int actual_sum=(nums.length*(nums.length+1))/2;
8        return actual_sum-sum;
9    }
10}