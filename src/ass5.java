import java.util.*;
public class ass5 {
    public static void main(String args[]) {
        try {
            byte barr[] = {'N','P','I','U','K','O','S'};
            System.out.println("Enter Index");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
           // String s2= new String(barr,n);
            System.out.println(barr[n]);
        }
        catch(Exception e) {
            System.out.println("Exception occured");

        }
    }
}
