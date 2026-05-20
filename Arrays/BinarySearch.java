public class BinarySearch {
    public static int binarysearch(int arr[], int key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mid = 0;
        while (low <= high) {
         mid = (low + high) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 3, 7, 11, 15, 16, 20, 25, 30 };
      int ans =   binarysearch(arr,11);
      System.out.println(ans);

    }
}
