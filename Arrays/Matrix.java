public class Matrix {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 3, 4, 5 } };
        // System.out.println(a[1][2]);
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
