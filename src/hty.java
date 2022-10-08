interface shapeX {
    public String base = "This is Shape1";


    public static void display1() {
    }
}
interface shapeY extends shapeX {
    public String base = "This is shape2";

    public default void display2() {

    }
}
 class ShapeG implements shapeY {
     public String base = "This is shape3";
     public  void display1() {
         System.out.println("circle"+" "+shapeX.base);
     }
     public  void display2() {
         System.out.println("circle"+" "+shapeY.base);
     }

 }


class hty  {

    public static void main(String args[]) {
        ShapeG b = new ShapeG();
        b.display1();
        b.display2();
    }
}
