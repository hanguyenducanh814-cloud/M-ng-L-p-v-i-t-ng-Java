import java.util.Scanner;
public class FindMin {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = {4,2,6,7,14,5,9};
        int index = minValue(array);
        System.out.println("The smallest element in the array is:"+array[index]);
    }
    public static int minValue(int[] array){
        int index = 0;
        for(int i =1;i < array.length;i++){
            if(array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}
