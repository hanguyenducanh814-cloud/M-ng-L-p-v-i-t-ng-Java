import java.util.Scanner;
public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = scanner.nextInt();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Nhập phần tử [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("\n--- MENU ---");
        System.out.println("1. Tính tổng một hàng");
        System.out.println("2. Tính tổng một cột");
        System.out.print("Lựa chọn của bạn: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Nhập chỉ số hàng (0 - " + (rows - 1) + "): ");
                int r = scanner.nextInt();
                if (r >= 0 && r < rows) {
                    System.out.println("Tổng hàng " + r + " là: " + sumRow(matrix, r));
                } else {
                    System.out.println("Chỉ số không hợp lệ!");
                }
                break;
            case 2:
                System.out.print("Nhập chỉ số cột (0 - " + (cols - 1) + "): ");
                int c = scanner.nextInt();
                if (c >= 0 && c < cols) {
                    System.out.println("Tổng cột " + c + " là: " + sumColumn(matrix, c));
                } else {
                    System.out.println("Chỉ số không hợp lệ!");
                }
                break;
            default:
                System.out.println("Lựa chọn sai!");
        }
    }
    public static double sumRow(double[][] matrix, int rowIndex) {
        double sum = 0;
        for (int j = 0; j < matrix[rowIndex].length; j++) {
            sum += matrix[rowIndex][j];
        }
        return sum;
    }
    public static double sumColumn(double[][] matrix, int colIndex) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][colIndex];
        }
        return sum;
    }
}
