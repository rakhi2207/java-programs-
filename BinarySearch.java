import java.util.*;
import java.util.Collections;
class BinarySearch {
    static int binarySearch(int n, int[] arr)
    {
        int low=0, high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==n)
                return mid;
            else if(arr[mid]>n)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
    static void sort(int[] arr)
    {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:arr)
            al.add(i);
        Collections.sort(al);
        for(int i=0;i<arr.length;i++)
            arr[i]=al.get(i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        System.out.println("Enter the array elements");
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter thr elements to be searched in the array");
        int n=sc.nextInt();
        sort(arr);
        int res = binarySearch(n, arr);
        if(res!=-1)
            System.out.println("Element found at "+res);
        else
             System.out.println("Element not found");
        sc.close();
    }
}