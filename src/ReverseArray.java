import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args){
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter a size");
            size = scanner.nextInt();
            if(size > 20);
            System.out.println("Size do not exceed 20");
        }while(size > 20);
        array = new int[20];
        int i = 0;
        while( i< array.length){
            System.out.print("Enter element" + (i+1) + ":");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s","Element is array:","");
        for(int j =0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
        for(int j=0;j < array.length/2;j++){
            int temp =array[i];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;
        }
        System.out.printf("\n%-20s%s","Reverse array:","");
        for(int j= 0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
    }
}
