1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int i=0;
4        int j=numbers.length-1;
5        while(i<j){
6            int sum=numbers[i]+numbers[j];
7            if(sum==target){
8                return new int []{i+1,j+1};
9            }
10            else if(sum<target){
11                i++;
12            }
13            else{
14                j--;
15            }
16        }
17        return null;
18    }
19}