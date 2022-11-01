package ivanbasic;

public class java_11_04_010_BreakAndContinue implements Lesson {
    public void main() {

        System.out.println("");
        System.out.print("CONTINUE ON 3:");
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.print(" (skip the rest of current iteration)");
                continue;
            }
            System.out.print(" " + i);
        }

        System.out.println("");
        System.out.print("BREAK ON 3:");
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.println(" (Leave the loop)");
                break;
            }
            System.out.print(" " + i);
        }


    }

}
