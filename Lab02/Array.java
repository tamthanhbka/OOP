import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total;
        int[] arr = {1,5,7,3,5};
        System.out.println("Mang ban dau: " + Arrays.toString(arr));
        System.out.print("Mang sau khi sap xep: ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        total = 0;
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.println("Tong: " + total);
        System.out.println("Trung binh cong: " + average);
        

    }

}
