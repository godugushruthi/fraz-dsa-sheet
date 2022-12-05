// https://leetcode.com/problems/majority-element/description/
/*
 DESCRIPTION : Here the problem is to find the majority element in the given array the majority element in the array means the element which occurs more than n/2 times 
 in the array.We are given array as input and we need to return the majority element in the given array.
 INPUT : [3,2,3]
 OUTPUT : 3
 APPROACH :My approach to solve this problem first sort the given array and now compare the ith element with i-1th element of the array if both are equal then increment 
 count value which will be having the occurance count of the element in array.now if the ith elem and i-1 th elem is not equal then we will check another two conditions 
 if the value of c>n/2 then will return nums[i-1] or else again intialize with c=1.
 */
class Solution
{
    public int majorityElement(int[] nums) 
    {
     Arrays.sort(nums);
     int i=1,c=1,max;
    while(i<nums.length)
     {
       if(nums[i]==nums[i-1])
         c++;
       else{
         if(c>nums.length/2)
           return nums[i-1];
         else  
           c=1; 
       }   
       i++;
    } 
      return nums[i-1];
    }
}
