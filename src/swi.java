import java.util.Scanner;
public class swi {
    public static void main(String [] arugs){
        Scanner grade = new Scanner(System.in);
        System.out.print("Enter Your Grade:");
        String grade1 = grade.next();

            switch (grade1) {

                case "A":
                    System.out.println("Very Good Pass");
                    break;
                case "B":
                    System.out.println("Good Pass");
                    break;
                case "C":
                    System.out.println("Normal Pass");
                    break;
                case "D":
                    System.out.println("Pass");
                    break;
                case "F":
                    System.out.println("Fail");
                    break;
                default:
                    System.out.println("Wrong Grade Entered");
                    break;
            }


    }
}
