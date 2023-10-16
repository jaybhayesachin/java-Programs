package loops_program;
import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER THE NUM");
        int num = scanner.nextInt();
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("fact of num=" + fact);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
