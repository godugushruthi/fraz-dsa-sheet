// https://leetcode.com/problems/find-pivot-index/description/
/*
Here the problem given is to find the pivot index means the index value where the leftsum from that index would be same as the right sum from that index.Let us understand
it with an example input : [1 7 3 6 5 6] here the pivot index is 3 becuase the leftsum from index 3= sum of indexes of 0,1,2 and right sum from index3 is = sum of index
of 4,5 if leftsum is equal to right from a particular index that index is said to be pivot index.here left sum from index 3 is = 1+7+3(n[0]+n[1]+n[2]) = 11 and right sum 
from index 3 is = 5+6(n[4]+n[5])=11 as leftsum and right sum are equal from index 3 it is a pivot index.
INPUT :[1 7 3 6 5 6]
OUTPUT :3

APPROACH : First we will find the total sum of array and store it in totalsum variable , we will also two more variables to store the leftsum and rigthsum intially leftsum
is = 0 and rightsum = totalsum and now we will traverse through array from index 0 to n-1 and now at index 0 the rightsum = totalsum - leftsum - nums[0] becuase we need
only the rightsum which is after the index 0 value hence we are subtracting it y leftsum we will know it shortly . now if leftsum is equal to rigthsum then return index i
or else leftsum value is updated as = leftsum+nums[i] becuase when we move to next index this index would be the left one for that so we are calculating the leftsum for 
next index and as i said rightsum=totalsum - leftsum - nums[i] now say we are at index 2 the left sum upto index 1 would be in leftsum var so directly we are subtracting it
from rightsum not by traversing it again.if we dont find pivot index we will return -1.
*/

class Solution
{
    public int  pivotIndex(int[] nums) 
    {
        int i=0,sum=0,leftsum=0,rigthsum=0;
        for(int j=0;j<nums.length;j++)
        {
            sum+=nums[j];
        }
        while(i<nums.length)
        {
          // leftsum=i>0?leftsum+nums[i-1]:leftsum;
           rigthsum=sum-(leftsum+nums[i]);
            if(leftsum==rigthsum)
             return i;
           leftsum+=nums[i];  
          i++;   
        }
          return -1;
    }
}
