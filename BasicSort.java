import java.util.Arrays;
import java.util.Collections;

public class BasicSort {
    //TC O(n*n)
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                if (arr[j] > arr[j+1]){
                    arr[j] = arr[j]^arr[j+1];
                    arr[j+1] = arr[j]^arr[j+1];
                    arr[j] = arr[j]^arr[j+1];
                }
            }
        }
    }

    //TC O(n*n)
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minAt = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minAt] > arr[j]) {
                    minAt = j;
                }
            }
    
            // Swap elements without using a temporary variable
            if (i==minAt) return;
            arr[i] = arr[i] + arr[minAt];
            arr[minAt] = arr[i] - arr[minAt];
            arr[i] = arr[i] - arr[minAt];
        }
    }
    
    //TC: O(n*n)
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }
    /*
     1 2 2 3 3 4 5
     1 1 2 2 1 1 0
     */
    // TC: O(n+k)
    public static void countSort(int[] arr){
        int n=arr.length, max = Integer.MIN_VALUE;

        for (int val:arr){
            if (val > max) max = val;
        }

        int[] temp = new int[max+1];

        for (int i=0; i<n; i++){
            temp[arr[i]]++;
        }

        int j=0;
        for (int i=0; i<n; i++){
            int count = temp[i];
            while(count>0){
                arr[j++] = i;
                count--;
            }
        }
    }

    // TC: O(n*logn)
    public static void inbuiltSort(int[] arr){
        Arrays.sort(arr);
    }
    public static void inbuiltSort(int[] arr, int si, int ei){
        Arrays.sort(arr, si, ei);
    }
    public static void inbuiltSort(Integer[] arr, boolean reverse){
        if (reverse) Arrays.sort(arr, Collections.reverseOrder()); 
    }
    public  static void inbuiltSort(Integer[] arr, int si, int ei, boolean reverse){
        if (reverse) Arrays.sort(arr, si, ei, Collections.reverseOrder());
    }
    
}
