1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int officer=0;
4        int count=1;   //to count unique elements
5        int CM=1;
6        while(CM<nums.length ){
7            if(nums[CM]==nums[CM-1]){
8                CM++;
9                continue;
10            }
11            else{
12                nums[officer+1]=nums[CM];
13                officer++;
14                count++;
15                CM++;
16            }
17        }
18      return count;  
19    }
20}