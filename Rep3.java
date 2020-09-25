import java.util.Scanner;
public class Rep3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] createArray;
        System.out.println("what lenght do you wnat for your array?");
        int x = input.nextInt();
        createArray = new int[x];

        for (int i = 1; i <=createArray.length; i++) {
            createArray[i] = i;
            System.out.println(createArray[i] + " ");
        }
        System.out.println();
    }
}