import java.util.Scanner;
public class task1 {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);

System.out.print("Enter an integer num: ");

int num1=obj.nextInt();

System.out.print("Enter a double num: ");

double num2=obj.nextDouble();

double addition=num1+num2;

double subtration=num1-num2;

double multiply=num1*num2;

double division=num1/num2;

System.out.println("Addition of "+num1+ " and "+ num2 + " = " + addition );
System.out.println("Subtration of "+num1+ " and "+ num2 + " = " + subtration );
System.out.println("Multiplication of "+num1+ " and "+ num2 + " = " + multiply );
System.out.println("Division of "+num1+ " and "+ num2 + " = " + division );




}    
}