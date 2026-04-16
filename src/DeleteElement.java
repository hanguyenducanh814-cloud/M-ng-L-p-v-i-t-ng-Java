import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 5};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập phần tử cần xoá: ");
        int x = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }

        if (index_del != -1) {
            System.out.println("Đã tìm thấy " + x + " tại vị trí " + index_del);
            for (int i = index_del; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
            System.out.print("Mảng sau khi xoá: ");
            for (int element : arr) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("Phần tử " + x + " không tồn tại trong mảng.");
        }
    }
}
