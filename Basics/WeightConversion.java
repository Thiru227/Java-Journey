import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        //Variable declaration
        double lbs;
        double kgs;
        //User selection of Conversion
        System.out.println("Welcome to Weight Conversion Meter!");
        System.out.println("Please Select an Option:(1 or 2)");
        System.out.println("1. lbs->Kgs");
        System.out.println("2. Kgs->lbs");
        Scanner scanner = new Scanner(System.in);
        short option = scanner.nextShort();
        //Conditional flow of the Program
        if (option == 1 || option == 2) {
            if (option == 1) {
                System.out.print("Enter the Weight in lbs:");
                lbs = scanner.nextDouble();
                kgs = lbs * 0.45359237;
                System.out.println("Result:");
                System.out.printf("%.2f lbs = %.2f kgs", lbs, kgs);
            } else {
                System.out.print("Enter the Weight in kgs:");
                kgs = scanner.nextDouble();
                lbs = kgs * 2.2046;
                System.out.println("Result:");
                System.out.printf("%.2f kgs = %.2f lbs", kgs, lbs);
            }
        } else {
            System.out.println("Please Enter an Appropriate Option (1/2)");
        }
    }
}

//16-04-2025:12.56am