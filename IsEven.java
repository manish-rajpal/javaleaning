import java.util.Scanner;

public class IsEven {

  public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Even Check. Please input number to check:");
    int input = sc.nextInt();
    System.out.print(IsEvenCheck(input));
}
    public static boolean IsEvenCheck(int input) {
      boolean y ;
      if(input%2==0)
      { y = true;}
      else{
      y = false;}
      return y;
    }

}

















/*
boolean final = IsEvenCheck(input);
System.out.println(final);
*/
