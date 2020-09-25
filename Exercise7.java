import java.util.Scanner;

  public class Exercise7 {
  public static void main(String[] args) {
System.out.println ("this code helps in printing a pyramid of numbers starting from 1 till your input value based on input value");
 int i,j,n,s,x;

  System.out.print ("Input number of rows : ");
  Scanner in = new Scanner(System.in);
  n = in.nextInt();

    s=n+4-1;

        for(i=1;i<=n;i++) /*here we initialise our counting variable from 1 to max value of input n and increment it*/
        {
              for(x=s;x!=0;x--) /*here we initilise a new variable  which is made equal to  a perviously initialised variable for reducing counting*/
              {
              System.out.print(" ");
              }

                for(j=1;j<=i;j++) /*this loop will print the value of i and keep incrementing by 1  till j = i and then exit*/
                {
                System.out.print(i+" ");/*note this is only print and not println*/
                }
              System.out.println(); s--; /*this is hte most important one as it enusres going back to  loop 2 where x=s */
            }
          }
        }





/*import java.util.Scanner;

public class Exercise7 {
 public static void main(String[] args) {

   int i,j,n,s,x;
    System.out.print ("Input number of rows : ");
    Scanner in = new Scanner(System.in);

    n = in.nextInt();
    //here n is input by user
    s=n+4-1;
    // here 2nd variable s takes value of the ()
      for(i=1;i<=n;i++) {
            for(x=s;x!=0;x--) {
            System.out.print(" ");
            }
              for(j=1;j<=i;j++) {
              System.out.print(i+"  ");
            }
            System.out.println(); s--;
          }
        }
      }*/
