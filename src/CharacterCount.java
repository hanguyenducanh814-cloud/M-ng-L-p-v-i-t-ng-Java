import java.util.Scanner;
public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "java programming language";
        System.out.println("Chuỗi hiện tại: " + str);
        System.out.print("Nhập ký tự bạn muốn đếm: ");
        char targetChar = scanner.next().charAt(0);
        int count = countOccurrences(str, targetChar);
        System.out.printf("Ký tự '%c' xuất hiện %d lần trong chuỗi.", targetChar, count);
    }
    public static int countOccurrences(String input, char find) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == find) {
                count++;
            }
        }
        return count;
    }
}
