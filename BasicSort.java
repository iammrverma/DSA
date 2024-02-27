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
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for (int i=0; i<n-1; i++){
            int minAt = i;
            for (int j=i+1; j<n; j++){
                if(arr[minAt] > arr[j]) minAt = j;
            }

            arr[i] = arr[i]+arr[minAt];
            arr[minAt] = arr[i]-arr[minAt];
            arr[i] = arr[i]-arr[minAt];
        }
    }

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
    
}
