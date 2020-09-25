public class sexTest {
    public static void main(String[] args) {
        int man = 16;
        int woman = 18;
        int child = 8;
        int dog = 4;
        for (int i = 0; i < 4; i++) {
            System.out.println("for loop");
            if ((man < 18) && (woman <=18) || (dog < 4)) {
                System.out.println("inside for and inside if");
            } else if (man == woman || child <= 8) {
                System.out.println("else if ");
            } else
                System.out.println("else");
        }
    }
}

