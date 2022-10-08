import java.util.Scanner;
public class tek {
    public static void main(String[] args)  {
        System.out.println("Enter value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i=0;
        int result = 1;
        while(result<=n) {
            if (i % 2 == 0) {
                if (i % 3 == 0) {
                    sum = sum + i;
                }
                result++;
            }
                i++;

        }
            System.out.println(sum);
    }
}
