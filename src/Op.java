interface ExtraLarge{
    static String extra = " This is extra-large";
    void display();
}
class Large {
    public void print() {
        System.out.println("This is Large");
    }

}
class Medium extends Large {
    public void print() {
        super.print();
        System.out.println("This is Medium");
    }
}
class Small extends Medium {
    public void print () {
        super.print();

        System.out.println("This is Small");
    }
}
class op implements ExtraLarge{
    public static void main(String args[]) {
        Small s = new Small();
        s.print();

        op q = new op();
        q.display();
    }
         public void display() {
             System.out.println(extra);
         }
     };




