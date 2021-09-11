import java.util.Scanner;
class sMethod{
   /* public void customer(){
        System.out.println("Welcome");
    } */
    public void cos1(){
        Scanner nN = new Scanner(System.in);
        System.out.print("Enter a Name:");
        String name1 = nN.next();
        System.out.println("");
        System.out.println("Hello" + name1);
    }

}

public class Conmethod {
    public static void main(){
        sMethod custem = new sMethod();
        custem.cos1();

    }
}
