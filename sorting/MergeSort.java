import java.util.Arrays;

public class MergeSort {
    public static void Divide(int arr[], int si, int li) {
        if (si >= li) {
            return;
        }
        int mid = si + (li - si) / 2;
        Divide(arr, si, mid);
        Divide(arr, mid + 1, li);
        conquer(arr, si, mid, li);
    }

    public static void conquer(int[] arr, int si, int mid, int li) {
        int merged[] = new int[li - si + 1];

        int i = 0;
        int index1 = si;
        int index2 = mid + 1;
        while (index1 <= mid && index2 <= li) {
            if (arr[index1] <= arr[index2]) {
                merged[i++] = arr[index1++];
            } else {
                merged[i++] = arr[index2++];
            }
        }
        while (index1 <= mid) {
            merged[i++] = arr[index1++];
        }
        while (index2 <= li) {
            merged[i++] = arr[index2++];
        }
        for (int k = 0, j = si; k < merged.length; k++, j++) {
            arr[j] = merged[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 2, 3, 9, 1, 4 };
        int si = 0;
        int li = arr.length - 1;
        Divide(arr, si, li);
        System.out.println(Arrays.toString(arr));
    }
}
