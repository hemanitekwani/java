import java.util.Scanner;
public class rest {
    public static void main(String args[]) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        int result;
        a = sc.nextInt();
        b = sc.nextInt();
        try{
            result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e) {
            System.out.println("Exception");
        }
    }
}
