import java.util.Scanner;
public class ani {
    public static void main(String[] args) {

        System.out.println("Enter number of subjects");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         double mark;
         int sum =0;
       System.out.println("enter marks");

       int [] arr = new int [n];
     for(int i=0; i<arr.length;i++)  {
         arr[i] = sc.nextInt();
     }
      int max = arr[0];
     for(int i=0;i<arr.length;i++) {
         if(max<arr[i]) {
             max = arr[i];
         }
     }
        System.out.println("max ="+ max);

        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
        }
        float avg = sum/arr.length;
        System.out.println("average="+ avg);
        }
    }