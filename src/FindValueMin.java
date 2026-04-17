import java.util.Scanner;
public class FindValueMin {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, -2, 9};
        int min = findMinValue(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
    public static int findMinValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
