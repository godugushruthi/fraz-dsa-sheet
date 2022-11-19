/*problem link in leetcode : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ */
/* EXPLANATION : 
 As we all know that profit=sellingprice-costprice,here in this problem we need to find the maximum profit which can be obtained by buying and selling stocks on different
 days.
 INPUT : different prices of stocks on i th days.
 OUTPUT : Maximum profit
 LOGIC : There are two approaches two solve this problem 
 1st approach : Consider that we are buying the stock on i th day (i.e which will be the costprice ) now we need to find the selling price such that profit is max from the
 i+1 prices in the array.As we need two loops for this outer one for costprice inner loop for the selling price hence it takes O(n^2) time complexity.
 2nd approach : Consider that we are not buying the stock rather we are selling the stock on ith day (i.e sellingprice) now we will calculate the minimum costprice such
 that our profit is maximum.
 cosider the input : [7,1,5,3,6,4] // maxpr=maxvalue,cp=maxvalue,sp,p
for 1st day if cp on that day is smaller than cp which we have initialized then change its value so cp=7,and we are cosidering sp=7 hence p=7-7=0 if p>maxpr then maxpr=p
for 2nd day now sp=1,is previous cp > than 2nday cp yes (i.e 7>1) so cp=1 p=1-1=0 maxpr=0
for 3rd day now sp=5,is previous cp>than 3rd day cp no(i.e 1>5) so cp=1 p=5-1=4 previous maxpr<3rd day maxpr(i.e 0<4 ) so maxpr=4
for 4th day now sp=3,is previous cp>than 4th  day cp no(i.e 1>3 so cp=1 p=3-1=2  previous maxpr<4th day maxpr no(i.e 4<2) so mapr=4
for 5th day now sp=6,is previous cp>than 4th  day cp no(i.e 1>6 so cp=1 p=6-1=5  previous maxpr<5th day maxpr yes(i.e 4<5) so mapr=5
for 5th day now sp=4,is previous cp>than 5th  day cp no(i.e 1>4 so cp=1 p=4-1=3  previous maxpr<5th day maxpr no(i.e 5<3) so mapr=5
hence maxprofit=5.
*/
import java.util.Scanner;
public class BestTimetoBuyandSellStock
{
    public static void main(String[] args)
    {
	     int cp=Integer.MAX_VALUE,sp,maxpr=Integer.MIN_VALUE,p=0;	
	     int n,input[];
	     Scanner sc=new Scanner(System.in);
	     n=sc.nextInt();
	     input=new int[n];
	     for(int i=0;i<n;i++)
	     {
	    	 input[i]=sc.nextInt();
	     }
	     for(int i=0;i<n;i++)
	     {
	    	 System.out.print(input[i]+" ");
	     }
	     System.out.println();
	     for(int i=0;i<n;i++)
	     {
	    	 sp=input[i];
	    	 if(cp>input[i])
	    		 cp=input[i];
	    	 p=sp-cp;
	    	 if(p>maxpr)
	    		 maxpr=p;
	     }
	     System.out.println("Maximum profit : "+maxpr);
	}
}

