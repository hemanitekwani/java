import java.util.Scanner;
public class hem {
     public static void main(String[] args) {
         System.out.println("Enter value of x");
         Scanner s = new Scanner(System.in);
         int x = s.nextInt();
         System.out.println("Enter value of y");
         Scanner p = new Scanner(System.in);
         int y = p.nextInt();
         System.out.println("Enter value of z");
         Scanner r = new Scanner(System.in);
         int z = r.nextInt();

         if(x>y&&x>z)  {
             System.out.println("x largest");
         }


        else if(y>x&&y>z)  {
           System.out.println("y largest");
       }
        else {
           System.out.println("z largest");
       }


     }
}
