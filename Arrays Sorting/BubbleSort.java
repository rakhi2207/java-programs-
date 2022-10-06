import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        int i;
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int j)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void bubble(int [] arr)
    {
        boolean swapped=false;
        int i,j;
        for(i=0;i<arr.length;i++) {
            for (j = 0; j < arr.length - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

    }
}
