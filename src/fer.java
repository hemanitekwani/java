import java.util.Scanner;
public class fer{
    public static void main(String args[]) {


        System.out.println("Enter value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            System.out.println(fibbo(n));
        }

    static int fibbo(int n) {
        if (n == 1)
            return 0;

        else if (n == 2)
            return 1;
        else
            return fibbo(n - 1) + fibbo(n - 2);
    }
    }


