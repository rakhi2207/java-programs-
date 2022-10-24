import java.util.*;
class BubbleSort {
    static void swap(int[] arr, int i){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
    static void bubbleSort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[(j+1)]){
                    swap(arr, j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, size);
        System.out.println("The array after sorting is: ");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
