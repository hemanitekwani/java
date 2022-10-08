import java.io.*;
import java.util.*;
 //java.lang.String;
public class ass7 {
    public static void main (String args[]) {
        try {
            String s1 = "NPTEl JAVA";
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            char c= 'a';
            byte [] barr = s1.getBytes();
            byte b1 = (byte) c ;
              barr[n] = b1;
            System.out.println( new String(barr));
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
