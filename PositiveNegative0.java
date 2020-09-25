import java.util.Scanner;
public class PositiveNegative0 {
  public static void main(String[] args)  {

    System.out.println("this is an positive negative & 0 check:");

    System.out.println("please input a number that you want us to check:");
    Scanner input = new Scanner(System.in);
    int value = input.nextInt();
    if(value > 0) {
        System.out.println("the number you entered" + value +". This number is positive ");
    }
    else if (value < 0)  {
      System.out.println("the number you entered" + value + ". This number is negative");
    }
    else {
      System.out.println("the number you entered   " + value + ". This number is equal to 0");
    }

  //  int value = input.nextInt();
  //  System.out.println(value);

  }
}







//    System.out.println("please input a name value that you want us to reprint");
//    double value = input.nextDouble();
//    char name = input.nextChar();
/*   int value = input.nextInt();
    char name = input.nextChar();*/
