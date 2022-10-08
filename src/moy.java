
  class circle {
      double radius;
      String color;
      circle(double r) {

          this.radius = r;
      }

      circle() {
          radius = 5;
          color = "red";
      }

      public double area() {
          return   Math.PI * radius * radius ;
      }
  }
      public class moy{
         public static void main(String args[]) {
             circle c1 = new circle(10);
             circle c2 = new circle();
             System.out.println(c1.area());
             System.out.println(c2.area());

         }
      }



