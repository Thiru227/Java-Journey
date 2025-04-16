import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculator:--->");
        System.out.print("Please Enter Digit 1:");
        double dig1= scanner.nextDouble();
        System.out.print("Please Enter Digit 2:");
        double dig2= scanner.nextDouble();
        System.out.println("Enter the  Mathematical Operation:");
        System.out.print("Option (+,-,*,/,%):");
        String option = scanner.next();
        double result=0;
        switch (option){
            case "+" -> {
                result=dig1+dig2;
                break;
            }
            case "-" -> {
                result=dig1-dig2;
                break;
            }
            case "*" -> {
                result=dig1*dig2;
                break;
            }
            case "/"  -> {
                result=dig1/dig2;
                break;
            }
            case "%" ->{
                result=dig1%dig2;
                break;
            }
            default -> {
                System.out.println("<-------Invalid Operation------->");
            }
        }
        System.out.println("Result: "+ result);

        scanner.close();
    }
}
