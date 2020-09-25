import java.util.Scanner;
  public class TakeTenOutThrice{
    public static void main(String[]args) {
      int i;
      for(i=0;i<3;i++){
        System.out.print("Input:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printSubractTen(input);
    }
  }
    public static void printSubractTen(int input) {
            int output = input - 10;
      System.out.println("Output:" + output);
    }
  }
