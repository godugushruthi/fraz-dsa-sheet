/* problem link : https://leetcode.com/problems/merge-sorted-array/ */
/* EXPLANATION : 
We need to merge the two sorted arrays which are given as input,and we need to store this merged array in the first input array.
INPUT : [1,2,3,0,0,0],[2,5,6] here we need to fill those zeros using the second array 
OUTPUT : [1,2,2,3,5,6]
LOGIC :
take three pointers say p1,p2,p3.p1 will be pointing to the 3rd element of arr1 and p2 will be pointing to arr2 last element p3 pointing to arr1 last element respectively.
now we will compare elements that are pointed by p2 and p1 and the greatest elem is placed at p3 pointer and decrement the p3,p2 pointer. we will repeat this until the 
p1 and p2 is greater than equal to 0.one element will be remained it may be either first elem of nums1 or first elem of nums2. */
//code:
public class MergeSortedArray
{
  public static void main(String args[])
  {
    int nums1[]={1,2,3,0,0,0};
    int nums2[]={2,5,6};
    int m=3,n=3;
    int i=n-1,j=m-1,k=(m+n)-1;
    while(i>=0&&j>=0)
    {
       if(nums1[i]>nums2[j])
       {
          nums1[k]=nums1[i];
          k--;
          i--;
       }
      else
      {
        nums1[k]=nums2[j];
        j--;
        k--;
      }
    }
    while(i>=0)
    {
      nums1[k]=nums1[i];
    }
    while(j>=0)
    {
      nums2[k]=nums2[j];
    }
  }
}

