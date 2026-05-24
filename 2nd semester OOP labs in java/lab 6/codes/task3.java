final class employee{
private int id;
private String name;
private double salary;
employee(int id,String name,double salary){
this.id=id;
this.name=name;
this.salary=salary;
}
double getsalary(){
return salary;
}
private void raisesalary(double a){
    double amount=a;
    salary=salary+amount;   
}
public void applyraise(double a){
raisesalary(a);
}
}


public class task3 {
public static void main(String[] args) {
employee e1=new employee(1, "taha", 1200);
e1.getsalary();
e1.applyraise(120);
System.out.println("Salary is: "+e1.getsalary());
}
}