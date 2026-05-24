import java.util.Scanner;
public class labexercise1 {
public static void main(String[] args){
Scanner ab=new Scanner(System.in);
System.out.print("Enter the salary: ");
int salary=ab.nextInt();
System.out.print("Enter the year of exprience: ");
int exprience=ab.nextInt();
if(exprience>=5){
salary+= salary*10/100;
}
System.out.println(
exprience>=5 && salary>70000?"Senior Manager":"Junior Staff"
);


}
    
}
