import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Dice {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        Random random =new Random();
        line();
        System.out.println("WELCOME TO DICE PROGRAM!!");
        line();
        System.out.print("Enter the number of dice to roll:");
        int noOfRolls = scanner.nextInt();
        line();
        int points =0;
        if(noOfRolls >0) {
            for (int i = 0; i < noOfRolls; i++) {
                int diceOutput = random.nextInt(1, 7);
                points += diceOutput;
                switch (diceOutput) {
                    case 1 -> {
                        System.out.println(" --------- ");
                        System.out.println("|         |");
                        System.out.println("|    0    |");
                        System.out.println("|         |");
                        System.out.println(" --------- ");
                    }
                    case 2 -> {
                        System.out.println(" --------- ");
                        System.out.println("| 0       |");
                        System.out.println("|         |");
                        System.out.println("|       0 |");
                        System.out.println(" --------- ");
                    }
                    case 3 -> {
                        System.out.println(" --------- ");
                        System.out.println("| 0       |");
                        System.out.println("|    0    |");
                        System.out.println("|       0 |");
                        System.out.println(" --------- ");
                    }
                    case 4 -> {
                        System.out.println(" --------- ");
                        System.out.println("| 0     0 |");
                        System.out.println("|         |");
                        System.out.println("| 0     0 |");
                        System.out.println(" --------- ");
                    }
                    case 5 -> {
                        System.out.println(" --------- ");
                        System.out.println("| 0     0 |");
                        System.out.println("|    0    |");
                        System.out.println("| 0     0 |");
                        System.out.println(" --------- ");
                    }
                    case 6 -> {
                        System.out.println(" --------- ");
                        System.out.println("| 0     0 |");
                        System.out.println("| 0     0 |");
                        System.out.println("| 0     0 |");
                        System.out.println(" --------- ");
                    }
                }
            }
            line();
                if (noOfRolls == 1) {
                    System.out.printf("Total Points while rolling a die: %d\n",points);
                } else {
                    System.out.printf("Total Points for %d dice: %d\n",noOfRolls,points);
                }
            line();

        }
        scanner.close();
    }
    static void line(){
        System.out.println("***********************************");
    }
}
