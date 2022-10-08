class Question62 implements Runnable{
    public void run() {
        System.out.println("Welcome to java 6 New Questions");
        System.out.println("Main thread is ended");
    }
    public static void main(String args[]) {
        Question62 T1= new Question62();
        Thread T2 = new Thread(T1);
        //System.out.println("Main thread is ended");
       T2.start();
       //System.out.println("Main thread is ended");

    }
}
