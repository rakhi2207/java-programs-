import java.util.*;

public class KadanesAlgorithm
{
    public static int maxSubArraySum(int[] array)
    {
        int i,currSum,maxSum;
        maxSum=currSum=array[0];
        for(i=1;i<=array.length-1;i++)
        {
            currSum=Math.max((currSum+array[i]),array[i]);
            if(currSum>maxSum)
                maxSum=currSum;
        }
        
        return maxSum;
    }

    public static void main(String[] args)
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("\nEnter array elements: ");
        for(i=0;i<=n-1;i++)
            arr[i]=sc.nextInt();
        sc.close();
        System.out.println("\nMaximum Subarray sum of the given array: "+maxSubArraySum(arr));
    }
}