import java.util.Scanner;

public class Exercise8  {
  public static void main(String[] args){
     int i, r, j, h;

     Scanner sc = new Scanner(System.in);

    System.out.println("please  input odd number here(half of diamond ) :");

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
      for(i=r-1;i>=1;i--) {
        for(j=1;j<=r-i;j++) {
          System.out.print(" ");
        }
          for(j=1;j<=2*i-1;j++) {
            System.out.print("*");
          }
        System.out.print("\n");
       }






  }
}














/*for(c=0;c<i;c++) {
  for(w=1;w<=i-c;w++) {
      System.out.print(" ");
    }
    System.out.println("*");
}*/
