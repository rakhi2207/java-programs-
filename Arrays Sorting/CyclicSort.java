import java.util.Arrays;

public class CyclicSort{
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        int i;
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int j)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void cyclic(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex])
            {
                swap(arr,i,correctIndex);
            }
            else
            {
                i++;
            }
        }
    }
}
