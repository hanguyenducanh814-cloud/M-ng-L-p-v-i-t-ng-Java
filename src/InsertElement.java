import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập phần tử cần thêm : ");
        int x = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn : ");
        int index = scanner.nextInt();
        if (index < 0 || index >= arr.length) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
            System.out.print("Mảng sau khi thêm: ");
            for (int element : arr) {
                System.out.print(element + " ");
            }
        }
    }
}
