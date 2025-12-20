1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int count=0;
4        for(int i=0;i<nums.length;i++){
5            if(i<nums.length-1 && nums[i]==nums[i+1]){
6                continue;
7            }
8            else{
9                nums[count]=nums[i];
10                count++;
11            }
12        }
13        return count;
14    }
15}