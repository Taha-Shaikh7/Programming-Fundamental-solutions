import java.util.Scanner;
public class labexercise4 {
public static void main(String[] args) {
Scanner ab=new Scanner(System.in);
System.out.print("Enter the Integer: ");
int num=ab.nextInt();
int left=num << 2;
int right=num >> 1;
System.out.println("left shift of "+ num+" is: "+left);
System.out.println("Right shift of "+ num+" is: "+right);
System.out.println("Prove \nleft shift "+num+" * 4 = "+(num*4)+"\nRight shift "+num+" / 2 = "+(num/2)+"\nHence Proved!");
if(left > right){
    System.out.println("Left shift number is larger than right: "+left);
}
else if(right > left){
    System.out.println("Right shift number is larger than left: "+right);
}
else{
    System.out.println("Left shift and right shift results are equal: "+left);
}









}
}
