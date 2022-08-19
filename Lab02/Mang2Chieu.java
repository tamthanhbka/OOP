import java.util.Arrays;
public class Mang2Chieu {
    public static void main(String[] args) {
        int arr1[][]={{1,2},{5,6},{9,1}};
        int arr2[][]={{5,2},{4,3},{8,5}};
        int arr3[][] = new int[3][2];
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Ma tran 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Ma tran 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Tong hai ma tran:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.exit(0);
    }
}
