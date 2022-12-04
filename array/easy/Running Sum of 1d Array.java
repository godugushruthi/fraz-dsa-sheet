//https://leetcode.com/problems/running-sum-of-1d-array/description/
/*
Problem given here is to find the running sum.Let us try to understand it with an input consider an array of elements say [1,2,3,4] now running sum is equal to [1 3 6 10]
the first index value is placed same second index value will be the sum of 2nd index value and previous index i.e 2+1=3 , for third index the value is equal to first,second,
third index values sum respectively..
INPUT : [1,2,3,4]
OUTPUT : [1 3 6 10]
*/
class Solution
{
    public int[] runningSum(int[] nums) 
    {
        int i=0;
      while(i<nums.length)
      {
           if(i==0)
             nums[i]=nums[i];
           else
            nums[i]=nums[i-1]+nums[i];  
        i++;    
      }  
      return nums; 
    }
}
