import java.util.Scanner;

public class ju extends point {
    public static void main(String args[]) {
        point p1 = new point ();
        System.out.println("Enter value of x");
        Scanner sc = new Scanner (System.in);

         p1.x= sc.nextDouble();
        System.out.println("Enter value of y");
         p1.y= sc.nextDouble();
        System.out.println("Enter value of p1");
        point p2 = new point ();
         p2.x= sc.nextDouble();
        System.out.println("Enter value of p2");
         p2.y= sc.nextDouble();

        ju j = new ju();
        j.distance(p1,p2);
         ;


    }
}
class point{
    double x;
    double y;
    public static void distance(point p1,point p2)  {


        double d =  Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
        System.out.println(d);
    }

}