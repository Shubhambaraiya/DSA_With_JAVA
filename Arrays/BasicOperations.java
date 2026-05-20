import java.util.*;

public class BasicOperations {
    public static void main(String []args){
        int arr[] = {7,2,3,4,5};
        // Accessing of array elments
        System.out.println(arr[0]);
        // Length of the Array
        int n = arr.length;
        System.out.println(n);
        // Modifying  array elements 
        arr[1] =50;
        System.out.println(arr[1]);
        // Sorting of Array
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int[] destination  = Arrays.copyOf(arr,n);
        for(int i = 0;i<destination.length;i++){
            System.out.println(destination[i]);
        }

    }
}
