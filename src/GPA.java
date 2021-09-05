import java.util.Scanner;
public class GPA {
    public static void main(String [] argus){
        Scanner gpa  = new Scanner(System.in);
        System.out.print("Enter your GPA:");
        double Gpa = gpa.nextDouble();
        //double Gpa = 3.1;

            if(Gpa == 4.0){
                System.out.println(" Great [First Class]");
            }
            else if(Gpa >= 3.7 && Gpa <= 3.99){
                System.out.println("First Class");
            }
            else if(Gpa >= 3.3 && Gpa <= 3.69){
                System.out.println("Second Upper");
            }
            else if(Gpa >= 3.0 && Gpa <= 3.299){
                System.out.println("Second Lower");
            }
            else if(Gpa >= 2.0 && Gpa <= 2.99){
                System.out.println("General");
            }
            else {
                System.out.println("Did Not Complete Success Full");
            }

    }
}
