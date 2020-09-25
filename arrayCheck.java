import java.util.*;
public class arrayCheck {
    public static void main(String[] args) {
        // define assign and initilize array
        int[] numbers = {55, 44, 33, 22, 11};
        System.out.println("this is to learn array functions which are  displaying , sorting and using and showing length");


        System.out.println("original array is ["  + numbers[0] +" "+ numbers[1] +" "+ numbers[2] +" "+ numbers[3] +" "+ numbers[4]+"]" );
        // here we have called the sort method of array
        Arrays.sort(numbers, 0, numbers.length );
        // we have printed the array by sorting it between position 0 and position 4

        String sort = Arrays.toString(numbers);

        System.out.println("sorted array for fulll array lenght is " + sort);
        // here we are printing the array


    }
}
