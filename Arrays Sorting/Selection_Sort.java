import java.util.Arrays;

public class Selection_Sort {
        public static void main(String[] args) {
            int arr[]={1,5,4,3,2,6};
            int i;
            selection(arr);
            System.out.println(Arrays.toString(arr));
        }
        static void swap(int[] arr,int i,int j)
        {
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        private static int getmax(int[] arr,int start,int end)
        {
            int max=start;
            for(int i=start;i<=end;i++)
            {
                if(arr[i]>arr[max]){
                    max=i;
                }
            }
            return max;
        }
        static void selection(int[] arr)
        {
            for(int i=0;i<arr.length;i++)
            {
                int last=arr.length-i-1;
                int maxIndex=getmax(arr,0,last);
                swap(arr,maxIndex,last);
            }
        }
}
