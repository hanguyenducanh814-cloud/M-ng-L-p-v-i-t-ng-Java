import java.util.Scanner;
public class FindValueMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Nhập 5 phần tử cho mảng:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phần tử " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int max = findValueMax(arr);
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
        scanner.close();
    }
    public static int findValueMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
