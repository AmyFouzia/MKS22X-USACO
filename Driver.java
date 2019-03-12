
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args) {
        try {
            System.out.println("Bronze:");
            for (int i = 1; i < 6; i++) {
                File correct = new File("testCases/makelake." + i + ".out");
                Scanner yes = new Scanner(correct);
                System.out.println(i + " " + (USACO.bronze("testCases/makelake." + i + ".in") == yes.nextInt()));
                yes.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        try {
            //System.out.println(USACO.silver("testCases/ctravel.2.in"));
            System.out.println("Silver:");
            for (int i = 1; i < 6; i++) {
                File checkPlus = new File("testCases/ctravel." + i + ".out");
                Scanner A = new Scanner(checkPlus);
                System.out.println(i + " " + (USACO.silver("testCases/ctravel." + i + ".in") == A.nextInt()));
                A.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
