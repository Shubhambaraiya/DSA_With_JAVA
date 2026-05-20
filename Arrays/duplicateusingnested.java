import java.util.*;
public class duplicateusingnested {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int arr[] = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
                }
                System.out.println();
            // Time complexity = (n*(n+10))/2
                for(int i = 0;i<size;i++){
                    for(int j=i+1;j<size;j++){
                        if(arr[i]==arr[j]){
                            System.out.println(arr[i]);

                        }
                    }
                }
            }
        }
    
