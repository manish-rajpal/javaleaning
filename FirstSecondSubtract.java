import java.util.Scanner;
  public class FirstSecondSubract{
    public static void main(String[]args) {

        System.out.println("Input 2 numbers :");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        printSubractTen(first, second);
    }
    public static void printSubractTen(int first, int second) {
            int output = first - second;
      System.out.println("Output:" + output);
    }
  }
