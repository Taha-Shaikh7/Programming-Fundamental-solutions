import java.util.Scanner;
public class task3 {
public static void main(String[] args) {
Scanner abc =new Scanner(System.in);
System.out.print("Enter the integer 1: ");
int num1=abc.nextInt();
System.out.print("Enter the integer 2: ");
int num2=abc.nextInt();
int remainder= num1 % num2;
System.out.println(remainder);
}
}
