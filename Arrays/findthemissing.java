import java.util.*;
public class findthemissing{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = sc.nextInt();
            }
            boolean istrue = true;
            for(int i = 0;i<size-1;i++){
                if(arr[i]>arr[i+1]){
istrue = false;
                }
            }
            if(istrue==true){
                System.out.println("The given array is sorted");
            }
        else{
            System.out.println("The given arrays is unsorted");
        }
    
}}