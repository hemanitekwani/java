import java.util.*;
public class assignment4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] name = new int[length];
        int sum = 0;

        try {
            for (int i = 0; i < length; i++) {
                sum = 0;
                int userInput = sc.nextInt();
                name[i] = userInput;
                sum = sum + name[i];

            }
            System.out.println(sum);
        } catch (InputMismatchException e) {
            System.out.println("you entered a bad data");

        }
    }
}
