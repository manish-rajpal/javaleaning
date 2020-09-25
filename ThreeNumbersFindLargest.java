import java.util.Scanner;

public class ThreeNumbersFindLargest {

  public static void main(String[] args)  {

    System.out.println("This takes 3 number inputs and outputs largest one");

    System.out.println("please input 3 numbers that you want us to check:");

    Scanner input = new Scanner(System.in);
    int entry1 = input.nextInt();
    int entry2 = input.nextInt();
    int entry3 = input.nextInt();

    System.out.println("yout have provided us the following 3 numbers" + entry1 +"  "+ entry2 +"   " + entry3);


      if(entry1 > entry2 && entry1 > entry3)     {
      System.out.println( entry1 +" is the bigest number  ");
      }
      else if(entry2 > entry1 && entry2 > entry3) {
      System.out.println( entry2 +" is the bigest number  ");
      }
      else if(entry3 > entry2 && entry3 > entry1) {
      System.out.println( entry3 +" is the bigest number  ");
        }
      }
  }
