abstract class employee{
String name;double salary;

employee(String name){
this.name=name;
}

abstract double calculatesalary();
}

class hourlyemployee extends employee{
int hour;
hourlyemployee(String name,int hour){
super(name);
this.hour=hour;
}

double calculatesalary(){
salary=300*hour;
return salary;
}
}

class salariedemployee extends employee{
salariedemployee(String name){
super(name);
}

double calculatesalary(){
salary=50000;
return salary;
}
}


public class task4 {
public static void main(String[] args) {

hourlyemployee he=new hourlyemployee("taha",5);
salariedemployee se=new salariedemployee("ahmed");

System.out.println("Hourly Salary of "+he.name+" of "+he.hour+" : "+he.calculatesalary());
System.out.println("Annual Salary of "+se.name+" : "+se.calculatesalary());
}
}
