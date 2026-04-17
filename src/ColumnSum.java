import java.util.Scanner;
public class ColumnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = scanner.nextInt();
        double[][] matrix = new double[rows][cols];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Phần tử [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextDouble();
            }
        }
        System.out.print("Bạn muốn tính tổng của cột mấy (tính từ 0)? ");
        int colIndex = scanner.nextInt();
        if (colIndex < 0 || colIndex >= cols) {
            System.out.println("Chỉ số cột không hợp lệ!");
        } else {
            double sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][colIndex];
            }
            System.out.printf("Tổng của cột %d là: %.2f%n", colIndex, sum);
        }
    }
}