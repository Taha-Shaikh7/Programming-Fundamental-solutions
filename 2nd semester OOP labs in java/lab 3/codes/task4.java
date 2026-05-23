import java.util.Scanner;
public class task4 {
public static void main(String[] args) {
Scanner ab=new Scanner(System.in);
System.out.print("Enter the floating number: ");
float num=ab.nextFloat();
float remainder = num % 5;
System.out.println("The remainder is: " + remainder);
ab.close();

}
    
}
