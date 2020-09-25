import java.util.Scanner;
public class Exercise5 {
  public static void main(String[] args)  {

    System.out.println("This takes an alphabet input and check to tell wether it is consonant or vowel");
    System.out.println("please input the alphabet:");

    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);

System.out.println(c);


   switch (c){
      case a:
      System.out.println("The input is a vowel");
      break;
      /*case e:
      System.out.println("The input is a vowel");
      break;
      case i:
      System.out.println("The input is a vowel");
      break;
      case o:
      System.out.println("The input is a vowel");
      break;
      case u:
      System.out.println("The input is a vowel");
      break;
      case ä:
      System.out.println("The input is a vowel");
      break;
      case å:
      System.out.println("The input is a vowel");
      break;*/
      default:System.out.println("you have input a consonant");
    }


    }

    }
