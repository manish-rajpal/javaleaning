import java.util.Scanner;
  public class TakeTenOut{
    public static void main(String[]args) {

        System.out.print("Input:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printSubractTen(input);
    }
    public static void printSubractTen(int input) {
            int output = input - 10;
      System.out.println("Output:" + output);
    }
  }
