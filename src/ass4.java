import java.io.*;
public class ass4 {
    public static void main(String args[]) {
        try {
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);
            String number = br.readLine();
            int x = Integer.parseInt(number);
            System.out.println(x * x);
        } catch (Exception e) {
            System.out.println("Please Enter valid data");
        }


    }
}
