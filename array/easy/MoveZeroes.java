/* https://leetcode.com/problems/move-zeroes/description/
Here it is a easy and simple question we are given an array as input which consists of both positive numbers as well zeroes we need to move this zeroes to last and all
positive numbers to front.
INPUT : [0 1 0 3 12]
OUTPUT : [1 3 12 0 0]
APPROACH : simple and easy one is to create a new array and fill the non zero numbers and then at last fill zeroes.But it requires more space for creating and storing 
into array.
we can use 2 pointers approach to solve this code let us assume that we are having two pointers i,j both pointing to zeroth index of array.now if value at i th position 
is not equal to zero we will swap with the value at j th position of the array and increment i,j values.
*/
class Solution
{
   public void moveZeroes(int[] nums) 
   {
    int j=0,i=0,t=0;
    /*
    int n[]=new int[nums.length];//approach 1
    for(int i=0;i<nums.length;i++)
     {
         if(nums[i]!=0){
          n[j]=nums[i];
          j++;
          }
    }
    while(j<nums.length)
    {
        n[j]=0;
        j++;
    }
    for(int i=0;i<nums.length;i++)
    {
        nums[i]=n[i];
    }*/
      while(j<nums.length)// approach 2
      {
          if(nums[j]!=0)
          {
              t=nums[i];
              nums[i]=nums[j];
              nums[j]=t;
              i++;
          }
          j++;
      }

    }
}
