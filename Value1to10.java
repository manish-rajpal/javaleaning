import java.util.Scanner;

public class Value1to10 {

    public static void main(String[]args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("input number between 0 to 10");
      int input = sc.nextInt();
      System.out.print(ValueCheck(input));
    }

    public static String ValueCheck(int input) {
      String x, y, z;
    if(input>=0 && input<=10) {
      y = "Gratulations you entered correct answer";  }
      else  {
      y = "Wrong please enter correct number between 0 to 10" ;  }
      return y;
  

  }
  }
