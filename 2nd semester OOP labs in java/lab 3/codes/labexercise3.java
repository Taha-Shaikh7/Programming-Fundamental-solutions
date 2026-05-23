import java.util.Scanner;
public class labexercise3{
public static void main (String[] args){
Scanner ab=new Scanner(System.in);
System.out.print("Enter 1st integer: ");
int num1=ab.nextInt();
System.out.print("Enter 2nd integer: ");
int num2=ab.nextInt();
System.out.print("Enter the operator (+,-,*,/,%) = ");
char operator=ab.next().charAt(0);
System.out.println(
    (operator=='+' || operator=='-' || operator=='*' 
    || operator=='/' || operator=='%') 
    ? "Valid operation" 
    : "Invalid operation"
);
if(operator=='+'){
System.out.println("Addition of "+num1+ " + " +num2+" = "+(num1+num2));
}
else if(operator=='-'){
System.out.println("Subtration of "+num1+ " - " +num2+" = "+(num1-num2));
}
else if(operator=='*'){
System.out.println("Multiplication of "+num1+ " * " +num2+" = "+(num1*num2));
}
else if(operator=='/'){
if(num2==0){
System.out.println("Cannot divide with zero!");
}
else{
System.out.println("Division of "+num1+ " / " +num2+" = "+(num1/num2));
}
}
else if(operator=='%'){
System.out.println("Modulus of "+num1+ " % " +num2+" = "+(num1%num2));
}
















}
}