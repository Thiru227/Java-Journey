import java.util.Scanner;

public class Circumference {
    public static void main(String[] args){
        double rad;
        double circum;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter Radius:");
        rad = scanner.nextInt();
        circum = Math.PI * Math.pow(rad,2);
        System.out.printf("Circumference of a Circle of Radius %.2fcm is %.2fcm²",rad, circum);
        scanner.close();


    }
}
