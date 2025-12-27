1class Solution {
2    public float findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int i=0,j=0,k=0;
4        int[] nums3=new int[nums1.length + nums2.length];
5        while(i<nums1.length && j<nums2.length){
6            if(nums1[i]<nums2[j]){
7                nums3[k]=nums1[i];
8                i++;
9                k++;
10            }
11            else{
12                nums3[k]=nums2[j];
13                j++;
14                k++;
15            }
16        }
17        while(i<nums1.length){
18            nums3[k]=nums1[i];
19            i++;
20            k++;
21        }
22        while(j<nums2.length){
23            nums3[k]=nums2[j];
24            j++;
25            k++;
26        }
27        if(nums3.length%2==0){
28            int mid=nums3.length/2;
29            return (float)(nums3[mid]+nums3[mid-1])/2;
30        }
31        else{
32            int mid=nums3.length/2;
33            return nums3[mid];
34        }
35    }
36    
37}