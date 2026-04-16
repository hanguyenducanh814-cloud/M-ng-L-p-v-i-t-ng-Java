import java.util.Scanner;
public class StudentArray {
    public static void main(String[] args){
        String[] students ={"Tung","Thang","Dat","Tuan"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name student:");
        String input_name = scanner.nextLine();
        boolean isExist =false;
        for(int i = 0 ; i < students.length ; i++){
            if(students[i].equalsIgnoreCase(input_name)){
                System.out.print("Position of the students in the list" + input_name + "is" + i);
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.print("Not found" + input_name + "in the list");
        }
        scanner.close();
    }
}
