import java.util.Scanner;
public class task7{
public static void main(String[] args) {
Scanner ab=new Scanner(System.in);
System.out.print("Enter an integer: ");
int num=ab.nextInt();
int result=~num;
System.out.println("Interger with Bitwise NOT is: "+result);


}
}