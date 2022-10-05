package Pepcoding;

public class Radix {

    public static void countSort(int[] arr,int exp)
    {
        int[] freq=new int[10];

        for(int i:arr)
        {
            freq[(i/exp)%10]++;
        }

        //prefix sum;
        int sum=0;
        for(int i=0;i<freq.length;i++)
        {
            sum+=freq[i];
            freq[i]=sum-1;
        }

        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            int pos=freq[(arr[i]/exp)%10];
            ans[pos]=arr[i];
            freq[(arr[i]/exp)%10]--;
        }

        for(int i=0;i<ans.length;i++)
        {
            arr[i]=ans[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={901,216,450,299,39};
        int max=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>max)
            {
                max=i;
            }
        }
        int exp=1;
        while(max>=exp) {
            countSort(arr, exp);
            exp=exp*10;
        }

        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
