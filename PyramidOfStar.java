import java.util.Scanner;

public class Exercise8  {
  public static void main(String[] args){
     int i, r, j;

     Scanner sc = new Scanner(System.in);

    System.out.println("please  input height of * diamond ) :");

    r = sc.nextInt();
      for(i=0;i<=r;i++) {
        for(j=1;j<=r-i;j++) {
          System.out.print(" ");
        }
          for(j=1;j<=2*i-1;j++) {
            System.out.print("*");
          }
        System.out.print("\n");
      }
