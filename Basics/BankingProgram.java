import java.util.Scanner;

public class BankingProgram {
    static double accountBalance = 0.00;
    static boolean isRunning=true;
    public static void main(String[] args) {
        line();
        System.out.println("---------Welcome to Bank!----------");
        line();

        while(isRunning){
        double withdrawAmt = 0.00;
        double depositAmt = 0.00;
        Scanner scanner = new Scanner(System.in);
        //Prompting User
        System.out.println("Please Enter the Service");
        line();
        System.out.println("(1) Check Your Account Balance");
        System.out.println("(2) Withdraw Money");
        System.out.println("(3) Deposit Money");
        System.out.println("(4) Exit");
        line();
        System.out.print("Option:");
        int option = scanner.nextInt();
        line();
        switch (option) {
            case 1 -> showBalance(accountBalance);
            case 2 -> {
                System.out.print("Please Enter Withdraw Amount: $");
                withdrawAmt = scanner.nextInt();
                line();
                withDraw(withdrawAmt);
            }
            case 3 -> {
                System.out.print("Please Enter Deposit Amount: $");
                depositAmt = scanner.nextInt();
                line();
                deposit(depositAmt);
            }
            case 4->exit();
            default -> System.out.println("Enter a Valid Option(1,2,3,4)");
        }
        line();

    }


    }

    static void showBalance(double accountBalance) {
        System.out.println("Account Balance: $" + accountBalance);
    }

    //withDraw
    static void withDraw(double withdrawAmt) {
        if (withdrawAmt > 0) {
            if (accountBalance > withdrawAmt) {
                System.out.println("Withdraw Initiated!");
                System.out.printf("$%.2f Ejected\n", withdrawAmt);
                System.out.println("Please Collect Cash!");
                accountBalance -= withdrawAmt;
            } else {
                System.out.println("Insufficient Balance!");
            }
        }
        else {
            System.out.println("Enter Valid Amount!");
        }
    }

    //deposit
    static void deposit(double depositAmt) {
        System.out.printf("Deposit of $%.2f Complete!\n",depositAmt);
        accountBalance += depositAmt;
    }
    static void exit(){
        isRunning =false;
        System.out.println("Exit!");
    }
    static void line(){
        System.out.println("***********************************");
    }


}
// A Banking Program that shows balance of the account, allows to withdraw and deposit cash
/*Highlights
I use a line() to print *** lines for readability
Scanner.close(); doesnt work! in while loop
 */
