import java.util.Scanner;
public class Teste {
    public static void main(String[]args) {
        System.out.println(anyIsTrue(false, false, false, false));
        System.out.println(anyIsTrue(true, false, false, false));
        System.out.println(anyIsTrue(false, true, false, false));
        System.out.println(anyIsTrue(false, false, true, false));
        System.out.println(anyIsTrue(false, false, false, true));
        System.out.println(anyIsTrue(true, true, true, true));
    }
    public static boolean anyIsTrue(boolean bool1, boolean bool2, boolean bool3, boolean bool4) {
        if(bool1 || bool2 || bool3 || bool4) {
            return true;
        } else {
            return false;
        }
    }
}