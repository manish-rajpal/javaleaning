import java.util.Scanner;

public class TaxCalc{

  public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Tax rate caluclator. Rate over 1 00 000 is 40%. Please enter your Gross Salary here :");
    double input = sc.nextDouble();
    double x = tax(input);
    System.out.println("Gross Salary=> " + input  + ". Tax Deducted as per tax table=> " + x);
    double y = input-x;
    System.out.println("Congratulations, Net Salary " + y);
  }
    public static double tax(double x) {
        if (x>=100000)
          {return x*0.4;}
        else
        {return x*0.3;}
      }
    }
