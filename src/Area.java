 import java.util.Scanner;
 public class Area {
        public static void main(String [] pissa){
int i=0;
              Scanner area = new Scanner(System.in);
            System.out.println("Select a Number to Calculate Area:");
               System.out.println("1.Square");
               System.out.println("2.Circle");
               System.out.println("3.Rectangle");
               System.out.println("4.Cylinder");
               System.out.print("Enter A Number (1 - 4): ");

              int x = area.nextInt();

               System.out.println("================================");

       switch(x) {

            case 1:
                System.out.print("Enter the Size of Side in the Square:");
                int a = area.nextInt();
                int Area1 = a * a;
                System.out.println("The Area of the Square is :" + Area1);
                break;

            case 2:
                System.out.print("Enter the Size of Radius in the Circle :");
                int b = area.nextInt();
                int Area2 = (22/7) * b * b;
                System.out.println("The Area of the Square is :" + Area2);
                break;

            case 3:
                System.out.print("Enter the Size of Sides one in the Rectangle :");
                int c1 = area.nextInt();
                System.out.print("Enter the Size of Sides two in the Rectangle :");
                int c2 = area.nextInt();
                int Area3 = c1 * c2;
                System.out.println("The Area of the Square is :" + Area3);
                break;

            case 4:
                System.out.print("Enter the Size of Radius in the Cylinder :");
                int d1 = area.nextInt();
                System.out.print("Enter the Size of Height in the Cylinder :");
                int d2 = area.nextInt();
                int Area4 = 2 * (22/7) * d1 * d2;
                System.out.println("The Area of the Square is :" + Area4);
                break;

            default:
                System.out.print("Enter a Number between 1 and 4 ");
                break;
        }


        }
}
