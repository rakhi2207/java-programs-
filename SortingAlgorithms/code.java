import java.util.Arrays;

public class Code {
	
	public static void main(String[] args) {
		int[] arr = {4 , 5 , 1 , 2 , 3};
		// Now just use any of the sorting functions
        //Also to see the results don't forget to print
        // use the Arrays.toString() Method while printing the arr
		}
/////////////////////////////////////////////////////////////////
	static void swap(int[] arr , int first , int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
/////////////////////////////////////////////////////////////////
	static int getMaxIndex(int arr[] , int start , int end) {
		int max = start;
		for(int i=start; i<=end; i++) {
			if(arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}
//////////////////////////////////////////////////////////////////
	static void quick(int[] nums , int low , int high) {
		if(low >= high) {
			return;
		}
		int s = low;
		int e = high;
		int mid = s + (e-s)/2;
		int pivot = nums[mid];
		
		while(s <= e) {
			while(nums[s] < pivot) {
				s++;
			}
			while(nums[e] > pivot) {
				e--;
			}
			
			if(s <= e) {
				swap(nums , s ,e);
				s++;
				e--;
			}
		}
		//now pivot is at correct index , please sort correct index
		quick(nums , low ,e);
		quick(nums , s , high);
	}	

/////////////////////////////////////////////////////////////////////
static void insertion(int arr[]) {
	for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j>0; j--) {
			if(arr[j] < arr[j-1]) {
				swap(arr , j , j-1);
			}else {
				break;
			}
		}
	}
}
/////////////////////////////////////////////////////////////////////
static void selection(int arr[]) {
	for(int i=0; i<arr.length; i++) {
		int last = arr.length-i-1;
		int maxIndex = getMaxIndex(arr , 0 , last);
		swap(arr , maxIndex ,last);
	}
}
////////////////////////////////////////////////////////////////////
static void bubble(int arr[]) {
	for(int i=0; i<arr.length-1; i++) {
		for(int j=0; j<arr.length-1-i; j++) {
			if(arr[j] > arr[j+1]) {
				swap(arr , j , j+1);
			}
		}
	}
}
/////////////////////////////////////////////////////////////////////
static int[] mergeSort(int[] arr) {
	if(arr.length == 1) {
		return arr;
	}
	
	int mid = arr.length / 2;
	
	int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
	int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
	
	return merge(left , right);
}

 static int[] merge(int[] first , int[] second) {
	int [] mix = new int[first.length + second.length];
	
	int i=0;
	int j=0;
	int k=0;
	
	while(i < first.length && j < second.length) {
		if(first[i] < second[j]) {
			mix[k] = first[i];
			i++;
		}else {
			mix[k] = second[j];
			j++;
		}
		k++;			
	}
	// it may be possible that one of the array is not complete
	// copy the remaining elements
	while(i < first.length) {
		mix[k] = first[i];
		i++;
		k++;
	}
	while(j < second.length) {
		mix[k] = second[j];
		j++;
		k++;
	}
	return mix;
 }
}