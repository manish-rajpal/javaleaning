import java.util.Scanner;
public class Rep {
    public static void main (String[] args) {

        int[] numbers = {4, 5, 6, 78, 8};
        int[] numbers2 = {4, 5, 6, 78, 8, 23, 34, 45, 56, 34};
        printOneArray(numbers);
        System.out.println();
        printOneArray(numbers2);
    }
    public static void printOneArray(int[] array)    {

        for(int i = 0; i<array.length; i++)  {
            System.out.println(array[i]);

        }
    }
}