import java.util.Scanner;

  class shape {
      double length,breadth;
      shape(double l,double b) {
           this.length = l;
           this.breadth= b;
      }
      shape(double l) {
         l= length=breadth;
      }
       double calculate() {
          return length* breadth ;
      }
  }
   class test1 extends shape {
      double height;
       test1(double length,double height) {
           super(length);
           this.height= height;
       }
       test1(double length, double breadth,double height) {
           super(length,breadth);
       }
       double calculate() {
           return length * breadth * height;
       }


       }


   public class we {
      public static void main(String args []) {
          shape ob1 = new shape(6,8);
          test1 t1  = new test1(3,9,7);

          System.out.println(ob1.calculate());
          System.out.println(t1.calculate());
      }
   }


