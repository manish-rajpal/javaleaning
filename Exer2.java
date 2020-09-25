import java.util.Scanner;
public class Exer2 {
    public static void main(String[] args) {
        System.out.println("Please input 4 nos to check:");
        Scanner sc = new Scanner(System.in);
        int[] n = new int[4];
        boolean check = false;
        while(check == false){
          for(int c=0; c<4; c++) {
              n[c] = sc.nextInt();
            }
              check = fourSame(n);
        }
    }
      public static boolean fourSame( int[] n) {
        if ((n[0] == n[1]) && (n[1] == n[2]) && (n[2] == n[3])) {
            System.out.println("the numbers are equal");
            return true;
        }
        else{
            System.out.println("the numbers are not equal. please input again.");
            return false;
        }
    }
}
