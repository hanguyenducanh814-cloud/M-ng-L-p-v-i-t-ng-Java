import java.util.Scanner;
import java.util.Arrays;
public class ArrayMerger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[2];
        System.out.println("Nhập dữ liệu cho mảng 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Phần tử " + i + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Nhập dữ liệu cho mảng 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Phần tử " + i + ": ");
            array2[i] = scanner.nextInt();
        }
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[array1.length + j] = array2[j];
        }
        System.out.println("Mảng sau khi gộp: " + Arrays.toString(array3));
    }
}