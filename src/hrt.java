import java.util.*;
public class hrt {
    public static void main(String args[]) {
        int sum = 0;
        System.out.println("Enter Values");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int n= sc.nextInt();
            sum = sum + n;
        }
        System.out.println(sum);
    }
}