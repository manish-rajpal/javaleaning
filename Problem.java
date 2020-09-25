import java.util.Scanner;
public class Problem  {
  public static void main(String[] args)  {
    Scanner sc = new Scanner (System.in);
    System.out.println("ange två tal, snälla rara du");
    int first;
    int second;
    first = sc.nextInt();
    second = sc.nextInt();
    //System.out.println(first);
  //  System.out.println(second);
    int result = first*second;
    System.out.println(result);
  }
}
