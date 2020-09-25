import java.util.Scanner;
public class Exercise6 {
public static void main(String[] args) {

  System.out.println("this will print multiplication table. Please input number to learn table till 10 ");

  Scanner sc = new Scanner(System.in);
  int no = sc.nextInt();
  int index =1;

    while (index>=1 && index <11) {
    System.out.println(no * index);
    index ++;
    }
  }
}
