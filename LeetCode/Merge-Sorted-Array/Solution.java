1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int i=m-1;
4        int j=n-1;
5        int k=m+n-1;
6        while(j>=0){
7            if(i>=0 && nums1[i]>nums2[j]){
8                nums1[k]=nums1[i];
9                i--;
10                k--;
11            }
12            else{
13                nums1[k]=nums2[j];
14                j--;
15                k--;
16            }
17        }
18    }
19}