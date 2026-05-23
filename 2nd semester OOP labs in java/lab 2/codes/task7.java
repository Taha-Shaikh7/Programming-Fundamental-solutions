import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed in miles per hour: ");
        double mph = sc.nextDouble();

        
        double kmph = mph * 1.609;
        System.out.println("Speed in kilometers per hour is: " + kmph);
    }
}
