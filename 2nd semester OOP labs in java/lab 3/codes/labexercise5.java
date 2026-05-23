import java.util.Scanner;
public class labexercise5 {
public static void main(String[] args) {
Scanner ab=new Scanner(System.in);
System.out.print("Enter the marks of 1st subject: ");
int num1=ab.nextInt();
System.out.print("Enter the marks of 2nd subject: ");
int num2=ab.nextInt();
System.out.print("Enter the marks of 3rd subject: ");
int num3=ab.nextInt();
System.out.println("Total marks are: "+(num1+num2+num3));
System.out.println("Average is: "+((num1+num2+num3)/3));
String overallResult = (num1 >= 40 && num2 >= 40 && num3 >= 40) ? "Passed" : "Fail";
System.out.println("Overall Result: " + overallResult);

}
}