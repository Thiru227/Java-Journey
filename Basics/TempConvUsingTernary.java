import java.util.Scanner;

public class TempConvUsingTernary {
    public static void main(String[] args){
        //Variable declaration
        double unit1;
        double unit2;
        //User selection of Conversion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Temparature Conversion Program!");
        System.out.print("Enter Temperature:");
        unit1 =scanner.nextDouble();
        System.out.println("Please Select an Option:(1 or 2)");
        System.out.println("1. fahrenheit->celsius");
        System.out.println("2. celsius->fahrenheit");
        short option = scanner.nextShort();
        if(option==1 || option==2){
            String display1= (option==1)? "°F":"°C";
            unit2 = (option==1) ?  ((unit1-32)*(5/9)):(unit1+32*(9/5));
            String display2= (option==1)? "°C":"°F";
            System.out.println("Result:");
            System.out.printf("%.2f%s = %.2f%s",unit1,display1,unit2,display2);

        }
    }
}

//16-04-2025:1.33am
