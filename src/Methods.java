import java.sql.SQLOutput;
import java.util.Scanner;
public class Methods {
    public static void main(String [] args) {
     /*   Scanner nName = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String nName1 = nName.next();
        //helloK (nName1);
        System.out.println(helloK(nName1));
        Scanner sSum = new Scanner(System.in);
        System.out.print("Enter The Number One:");
        int a = sSum.nextInt();
        System.out.print("Enter The Number Two:");
        int b = sSum.nextInt();
        double sum2 = sum(a,b);
        System.out.println("The Sum is " + sum2);
        //System.out.println(sum(a,b)); */

        Scanner eNumb = new Scanner(System.in);
        System.out.print("Enter Number One:");
        int k  = eNumb.nextInt();
        System.out.print("Enter Number Two:");
        int h  = eNumb.nextInt();
        //evenCk(k,h);
        //System.out.println(evenCk(k,h));

        if (evenCk(k,h) == true){
            System.out.println("The Number is Even");
        }
        else {
            System.out.println("The Number Is not even");
        }


    }
   /* public static String helloK(String name){
        //System.out.println("Hello  " + name);
        return "Hello " + name + " Welcome";
    }
    public static double sum(int x , int y){
        double sum1 =  x + y;
        return sum1;
    } */
    public static boolean evenCk(int z , int r) {
        int sS = z + r;
        if (sS % 2 == 0) {
           // System.out.println("The Number is Even");
            return true;
        }
        else {
            //System.out.println("The Number Is not even");
            return false;
        }
    }


}
