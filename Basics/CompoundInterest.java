import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        double principalAmount;
        double rate;
        int timesCompounded;
        int years;

        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter Principal Amount: ₹");
        principalAmount = scanner.nextDouble();

        System.out.print("Enter the rate of Interest:");
        rate =scanner.nextDouble();

        System.out.print("Enter the times Compounded:");
        timesCompounded=scanner.nextInt();

        System.out.print("Enter the years:");
        years=scanner.nextInt();


        double amount = principalAmount*(Math.pow((1+(rate/100)/timesCompounded),(timesCompounded*years)));
        System.out.println("Final Amount after Compound Interest is ₹"+amount);



        scanner.close();
    }
}

//15-04-2025:11.39pm:Done
